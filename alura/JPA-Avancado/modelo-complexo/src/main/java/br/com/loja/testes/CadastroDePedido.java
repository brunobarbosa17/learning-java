package br.com.loja.testes;

import br.com.loja.VO.RelatorioDeVendasVO;
import br.com.loja.dao.CategoriaDAO;
import br.com.loja.dao.ClienteDAO;
import br.com.loja.dao.PedidoDAO;
import br.com.loja.dao.ProdutoDAO;
import br.com.loja.model.*;
import br.com.loja.util.JPAUtil;
import br.com.loja.model.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDePedido {
  public static void main(String[] args) {

    popularBancoDeDados();
    EntityManager em = JPAUtil.getEntityManager();
    ProdutoDAO produtoDAO = new ProdutoDAO(em);
    Produto produto = produtoDAO.buscarPorId(1l);
    Produto produto2 = produtoDAO.buscarPorId(2l);
    Produto produto3 = produtoDAO.buscarPorId(3l);

    ClienteDAO clienteDAO = new ClienteDAO(em);
    Cliente cliente = clienteDAO.buscarPorId(1l);

    em.getTransaction().begin();


    Pedido pedido = new Pedido(cliente);
    pedido.adicionarItem(new ItemPedido(10, pedido, produto));
    pedido.adicionarItem(new ItemPedido(40, pedido, produto2));

    Pedido pedido2 = new Pedido(cliente);
    pedido.adicionarItem(new ItemPedido(2, pedido, produto3));

    PedidoDAO pedidoDAO = new PedidoDAO(em);
    pedidoDAO.cadastrar(pedido);
    pedidoDAO.cadastrar(pedido2);

    em.getTransaction().commit();

    BigDecimal totalVendido = pedidoDAO.valorTotalVendido();
    System.out.println("Valor total: R$"+ totalVendido);

    List<RelatorioDeVendasVO> relatorio = pedidoDAO.relatorioDeVendas();

    relatorio.forEach(e -> System.out.println(e));
  }

  private static void popularBancoDeDados() {
    Categoria celulares = new Categoria("CELULARES");
    Categoria videogames = new Categoria("VIDEOGAMES");
    Categoria informatica = new Categoria("INFORMATICA");

    Produto celular = new Produto("Galaxy S20FE", "128GB 6GB", new BigDecimal("800"), celulares);
    Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("5000"), videogames);
    Produto macbook = new Produto("Macbook", "Retina", new BigDecimal("8000"), informatica);

    Cliente cliente = new Cliente("Rodrigo", "123456");

    EntityManager em = JPAUtil.getEntityManager();
    ProdutoDAO produtoDAO = new ProdutoDAO(em);
    CategoriaDAO categoriaDAO = new CategoriaDAO(em);
    ClienteDAO clienteDAO = new ClienteDAO(em);

    em.getTransaction().begin();
    categoriaDAO.cadastrar(celulares);
    categoriaDAO.cadastrar(videogames);
    categoriaDAO.cadastrar(informatica);
    produtoDAO.cadastrar(celular);
    produtoDAO.cadastrar(videogame);
    produtoDAO.cadastrar(macbook);
    clienteDAO.cadastrar(cliente);
    em.getTransaction().commit();
    em.close();
  }
}
