abstract class Conta(
  val titular: String,
  val numero: Int) {

  var saldo = 0.0
    private set;


  fun deposita(valor: Double) {
    this.saldo += valor;
  }

  open fun sacar(valor: Double): Boolean {
    if (saldo - valor >= 0.0) {
      saldo -= valor;
      return true;
    }

    return false;
  }

  fun transfere(valor: Double, destino: Conta): Boolean {
    if (saldo >= valor) {
      saldo -= valor;
      destino.deposita(valor);
      return true;
    }

    return false;
  }


}