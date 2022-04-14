package br.com.loja.dao;

import javax.persistence.EntityManager;

import br.com.loja.model.Produto;

import java.math.BigDecimal;
import java.util.List;

public class ProdutoDAO {

  private EntityManager em;

  public ProdutoDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Produto produto) {
    this.em.persist(produto);
  }

  public void remover(Produto produto) {
    produto = em.merge(produto);
    this.em.remove(produto);
  }

  public Produto buscarPorId(Long id) {
    return em.find(Produto.class, id);
  }

  public List<Produto> buscarTodos() {
    String jpql = "SELECT p FROM Produto AS p";

    return em.createQuery(jpql, Produto.class).getResultList();
  }

  public List<Produto> buscarPorNome(String nome) {
    String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";

    return em.createQuery(jpql, Produto.class)
            .setParameter("nome", nome)
            .getResultList();
  }

  public List<Produto> buscarPorNomeCategoria(String nomeCategoria) {
    String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nomeCategoria";

    return em.createQuery(jpql, Produto.class)
            .setParameter("nomeCategoria", nomeCategoria)
            .getResultList();
  }

  public BigDecimal buscarPrecoProdutoPorNome(String nome) {
    String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome";

    return em.createQuery(jpql, BigDecimal.class)
            .setParameter("nome", nome).getSingleResult();
  }
}
