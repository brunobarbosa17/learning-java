import xmlGenerator.Produto;

import java.lang.reflect.Field;

public class Analisador {
  public static void main(String[] args) {

    Object o;
    Produto p = new Produto();
    p.setId(1234);
    p.setDescricao("Mouse");
    p.setPreco(50);
    p.setLinkFoto("mouse.jpg");

    o = p;

    System.out.println("A referencia aponta para o tipo: " + p.getClass().getSimpleName());

    try {

      Field[] atributos = o.getClass().getDeclaredFields();

      for (Field f: atributos) {
        System.out.println("Atributo " + f.getName());
      }

      Field f = o.getClass().getDeclaredField("descricao");
      f.setAccessible(true);
      System.out.println(f.get(o));
      f.set(o, "mouse rgb led gamer");
      System.out.println(p);


    } catch (Exception ex) {
      System.err.println("Algo errado" + ex);
      ex.printStackTrace();
    }
  }
}
