import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeituraArquivos {
  public static void main(String[] args) {

    try {
      File arquivo = new File("src/Nomes.txt");
      FileReader leitor = new FileReader(arquivo);
      BufferedReader br = new BufferedReader(leitor);

      br.readLine();
      String dadosAluno = "";

      do {
        dadosAluno = br.readLine();

        try {

          Aluno a = FabricaAlunos.criarAlunoFromCSV(dadosAluno);
          System.out.println(a);

        } catch (DadosAlunoException | CSVFormatException ex) {
          System.err.println("ERro ao criar aluno! " + ex);
        }

      } while(dadosAluno != null);


    } catch(Exception ex) {
      System.out.println("Num foi");
      ex.printStackTrace();
    }
  }
}
