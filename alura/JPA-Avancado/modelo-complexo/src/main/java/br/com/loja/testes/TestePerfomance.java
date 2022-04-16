package br.com.loja.testes;

import br.com.loja.dao.CategoriaDAO;
import br.com.loja.dao.ClienteDAO;
import br.com.loja.dao.PedidoDAO;
import br.com.loja.dao.ProdutoDAO;
import br.com.loja.model.*;
import br.com.loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class TestePerfomance {
    public static void main(String[] args) {
        popularBancoDeDados();
        EntityManager em = JPAUtil.getEntityManager();

        Pedido pedido = em.find(Pedido.class, 1l);

        PedidoDAO pedidoDAO = new PedidoDAO(em);
        Pedido pedidoComCliente = pedidoDAO.buscarPedidoComCliente(1l);
        System.out.println(pedidoComCliente);
        em.close();
        System.out.println(pedido.getCliente().getNome());
    }

    private static void popularBancoDeDados() {
        Categoria celulares = new Categoria("CELULARES");
        Categoria videogames = new Categoria("VIDEOGAMES");
        Categoria informatica = new Categoria("INFORMATICA");

        Produto celular = new Produto("Galaxy S20FE", "128GB 6GB", new BigDecimal("800"), celulares);
        Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("5000"), videogames);
        Produto macbook = new Produto("Macbook", "Retina", new BigDecimal("8000"), informatica);

        Cliente cliente = new Cliente("Rodrigo", "123456");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarItem(new ItemPedido(10, pedido, celular));
        pedido.adicionarItem(new ItemPedido(40, pedido, videogame));

        EntityManager em = JPAUtil.getEntityManager();
        PedidoDAO pedidoDAO = new PedidoDAO(em);
        pedidoDAO.cadastrar(pedido);
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
