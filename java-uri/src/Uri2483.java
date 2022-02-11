import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2483 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int quantidadeAs = sc.nextInt();
    /*List<String> a = new ArrayList<String>();

    for (int i = 0; i < quantidadeAs; i++) {
      a.add("a");
    }
    a.add("l!");*/
    
    StringBuilder mensagem = new StringBuilder("Feliz nat");
    StringBuilder As = new StringBuilder("");
    for (int i = 0; i < quantidadeAs; i++) {
      As.append("a");
    }
    mensagem.append(As);
    mensagem.append("l!");

    System.out.println(mensagem);


    sc.close();
  }
  
}