import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {

    List<String> lista = new ArrayList<>();
    lista.add("Bruninho");
    lista.add("lucas");
    lista.add("Barbosa");

    //lista.removeIf(x -> x.charAt(0) == 'b');

    for(String elemento: lista) {
      System.out.println(elemento);
    }

    //System.out.println(lista.indexOf("Barbosa "));

    List<String> result = lista.stream()
            .filter(x -> x.charAt(0) == 'B')
            .collect(Collectors.toList());

    System.out.println(result);

    String name = lista.stream().
            filter(x -> x.charAt(0) == 'X').
            findFirst().orElse("tttt");

    System.out.println(name);

  }
}
