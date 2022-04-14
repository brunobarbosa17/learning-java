public abstract class Conta {
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;
  private static int total;

  public Conta() {

  }

  public Conta(int numero, int agencia) {
    Conta.total++;
    setAgencia(agencia);
    setNumero(numero);
  }

  public abstract void deposita(double valor);

  public void saca(double valor) {
    if(this.saldo < valor) {
      throw new SaldoInsuficienteException("Saldo : " + getSaldo() + " Valor: " + valor);
    }

    this.saldo -= valor;
  }

  public void transfere(double valor, Conta destino) {
      this.saca(valor);
      destino.deposita(valor);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int novoNumero) {
    if (novoNumero <= 0) {
      System.out.println("Número Inválido!");
      return;
    }
    this.numero = novoNumero;
  }

  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    if(agencia <= 0) {
      System.out.println("Agencia inválida!");
      return;
    }
    this.agencia = agencia;
  }

  public void setTitular(Cliente titular) {
    this.titular = titular;
  }

  public Cliente getTitular() {
    return titular;
  }

  public static int getTotal() {
    return total;
  }
}
