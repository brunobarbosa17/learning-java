package br.com.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.loja.dao.CategoriaDAO;
import br.com.loja.dao.ProdutoDAO;
import br.com.loja.model.Categoria;
import br.com.loja.model.CategoriaId;
import br.com.loja.model.Produto;
import br.com.loja.util.JPAUtil;

public class CadastroDeProduto {
  public static void main(String[] args) {
    cadastrarProduto();

    EntityManager em = JPAUtil.getEntityManager();
    ProdutoDAO produtoDAO = new ProdutoDAO(em);

    //Produto p = produtoDAO.buscarPorId(1l);
    List<Produto> produtoList = produtoDAO.buscarPorNomeCategoria("CELULARES");

    // final var produtoList = produtoDAO.buscarTodos();
    produtoList.forEach(produto -> System.out.println(produto.getNome()));
;
    BigDecimal preco = produtoDAO.buscarPrecoProdutoPorNome("Galaxy S20FE");
    System.out.println(preco);
  }

  private static void cadastrarProduto() {
    Categoria celulares = new Categoria("CELULARES");
    Produto celular = new Produto("Galaxy S20FE", "128GB 6GB", new BigDecimal("800"), celulares);

    EntityManager em = JPAUtil.getEntityManager();
    ProdutoDAO produtoDAO = new ProdutoDAO(em);
    CategoriaDAO categoriaDAO = new CategoriaDAO(em);

    em.getTransaction().begin();
    categoriaDAO.cadastrar(celulares);
    produtoDAO.cadastrar(celular);
    em.getTransaction().commit();

    em.close();
  }
}