package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postagem {

  private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

  private Date moment;
  private String titulo;
  private String conteudo;
  private Integer likes;

  private List<Comentario> comentarios = new ArrayList<>();

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(titulo + "\n");
    sb.append(likes);
    sb.append(" Likes - ");
    sb.append(sdf.format(moment) + "\n");
    sb.append(conteudo + "\n");
    sb.append("Comentários:\n");

    for (Comentario c: comentarios) {
      sb.append(c.getText() + "\n");
    }


    return sb.toString();
  }

  public Postagem() {}

  public Postagem(Date moment, String titulo, String conteudo, Integer likes) {
    this.moment = moment;
    this.titulo = titulo;
    this.conteudo = conteudo;
    this.likes = likes;
  }

  public Date getMoment() {
    return moment;
  }

  public void setMoment(Date moment) {
    this.moment = moment;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public Integer getLikes() {
    return likes;
  }

  public void setLikes(Integer likes) {
    this.likes = likes;
  }

  public List<Comentario> getComentarios() {
    return comentarios;
  }

  public void adicionarComentario(Comentario comentario) {
    comentarios.add(comentario);
  }

  public void removerComentario(Comentario comentario) {
    comentarios.remove(comentario);
  }

}
