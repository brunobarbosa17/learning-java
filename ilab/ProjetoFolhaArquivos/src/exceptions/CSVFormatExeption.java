package exceptions;

public class CSVFormatExeption extends RuntimeException {
  public CSVFormatExeption(String mensagem) {
    super(mensagem);
  }
}
