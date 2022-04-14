package exceptions;

import core.Funcionario;

public class DadosFuncionarioException extends RuntimeException {
  public DadosFuncionarioException(String mensagem) {
    super(mensagem);
  }
}
