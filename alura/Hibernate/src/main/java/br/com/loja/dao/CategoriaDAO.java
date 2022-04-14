package br.com.loja.dao;

import br.com.loja.model.Categoria;
import br.com.loja.model.Produto;

import javax.persistence.EntityManager;

public class CategoriaDAO {

  private EntityManager em;


  public CategoriaDAO(EntityManager em) {
    this.em = em;
  }

  public void cadastrar(Categoria categoria) {
    this.em.persist(categoria);
  }

  public void remover(Categoria categoria) {
    categoria = em.merge(categoria);
    this.em.remove(categoria);}
}
