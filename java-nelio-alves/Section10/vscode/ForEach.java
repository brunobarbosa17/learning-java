public class ForEach {
  public static void main(String[] args) {
    String[] vetor = new String[] {"Bruninho", "Bruno", "Brunao"};

    for (int i = 0; i < vetor.length; i++) {
      System.out.println(vetor[i]);
    }

    for (String nome : vetor) {
      System.out.println(nome);
    }



    
  }
}