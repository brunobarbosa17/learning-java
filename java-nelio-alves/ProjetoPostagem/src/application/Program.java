package application;

import entities.Comentario;
import entities.Postagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comentario c1 = new Comentario("Bela viagem!");
    Comentario c2 = new Comentario("Uau que show!");

    Postagem p1 = new Postagem(sdf.parse("21/06/2018 13:05:44"),
            "Viagem a Nova Zelândia",
            "Visitando este belo pais!!!",
            12);

    p1.adicionarComentario(c1);
    p1.adicionarComentario(c2);

    System.out.println(p1);
  }
}
