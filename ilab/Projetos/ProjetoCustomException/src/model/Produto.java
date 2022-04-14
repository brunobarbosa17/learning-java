package model;

import exception.ProdutoException;

public class Produto {

    private int id;
    private double preco;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new ProdutoException("Id não pode ser menor ou igual a zero!");
        }
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.length() == 0) {
            throw new ProdutoException("Descricao nao pode ser vazia!");
        }
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", preco=" + preco +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
