public class FabricaAlunos {

  public static Aluno criarAlunoFromCSV(String linha) {
    Aluno aluno;

    String[] dados = linha.split(";");
    if(dados.length != 3)
      throw new CSVFormatException("É necessário informar os dados corretamente");

    try {
      aluno = new Aluno(dados[0].trim(), Double.parseDouble(dados[1].trim()), Double.parseDouble(dados[2].trim()));

    } catch (NumberFormatException  | NullPointerException ex) {
      throw new DadosAlunoException("Dados inválidos!");
    }

    return aluno;
  }

}
