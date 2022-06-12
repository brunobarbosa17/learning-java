package br.com.loja.model;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class CategoriaId implements Serializable {

    private String tipo;
    private String nome;

    public CategoriaId(){}

    public CategoriaId(String tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}