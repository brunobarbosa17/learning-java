package core;

public class Estudante extends Pessoa {
  private int numeroMatricula;

  public Estudante(String nome, String email, String telefone, int numeroMatricula) {
    super(nome, email, telefone);
    setNumeroMatricula(numeroMatricula);

  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  public void setNumeroMatricula(int numeroMatricula) {
    this.numeroMatricula = numeroMatricula;
  }


  @Override
  public void mostrar() {
    System.out.println("Estudante: "+super.getNome()+"/"+super.getEmail()+"/"+super.getTelefone());
  }


}