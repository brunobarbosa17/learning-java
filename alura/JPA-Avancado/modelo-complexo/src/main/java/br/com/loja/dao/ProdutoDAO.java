package br.com.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import br.com.loja.model.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;
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
    return em.createNamedQuery("Produto.produtosPorCategoria", Produto.class)
            .setParameter("nomeCategoria", nomeCategoria)
            .getResultList();
  }

  public BigDecimal buscarPrecoProdutoPorNome(String nome) {
    String jpql = "SELECT p.preco FROM Produto p WHERE p.nome = :nome";

    return em.createQuery(jpql, BigDecimal.class)
            .setParameter("nome", nome).getSingleResult();
  }

  public List<Produto> buscarPorParametros(String nome,
                                           BigDecimal preco,
                                           LocalDate dataCadastro) {
    String jpql = "SELECT p FROM Produto p WHERE 1=1";
    if (nome != null && !nome.trim().isEmpty()) {
      jpql += "AND p.nome = :nome";
    }
    if (preco != null) {
      jpql += "AND p.preco = :preco";
    }
    if (dataCadastro != null) {
      jpql += "AND p.dataCadastro = :dataCadastro";
    }

    TypedQuery<Produto> query = em.createQuery(jpql, Produto.class);
    if (nome != null && !nome.trim().isEmpty()) {
      query.setParameter("nome", nome);
    }
    if (preco != null) {
      query.setParameter("preco", preco);
    }
    if (dataCadastro != null) {
      query.setParameter("dataCadastro", dataCadastro);
    }
    return query.getResultList();
  }

  public List<Produto> buscarPorParametrosCriteria(String nome,
                                           BigDecimal preco,
                                           LocalDate dataCadastro) {

    CriteriaBuilder builder = em.getCriteriaBuilder();
    CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
    Root<Produto> from = query.from(Produto.class);

    Predicate filtros = builder.and();
    if (nome != null && !nome.trim().isEmpty()) {
      builder.and(filtros, builder.equal(from.get("nome"),nome));
    }
    if (preco != null) {
      builder.and(filtros, builder.equal(from.get("preco"),preco));
    }
    if (dataCadastro != null) {
      builder.and(filtros, builder.equal(from.get("dataCadastro"),dataCadastro));
    }


  }
}
