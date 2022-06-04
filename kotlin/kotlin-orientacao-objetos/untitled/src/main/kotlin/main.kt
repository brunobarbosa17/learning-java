import java.util.StringJoiner

fun main() {

  val conta = Conta();
  conta.titular = "Bruno";
  conta.deposita(100.0);
  println(conta.titular);
  println(conta.saldo);
  conta.sacar(500.0);
  println(conta.sacar(5000.0))

  val conta2 = Conta("Bruno 2", 1234);
}

class Conta(titular: String, numero: Int) {

  var titular = "";
  var numero = 0;
  var saldo = 0.0
    private set;


  fun deposita(valor: Double) {
    this.saldo += valor;
  }

  fun sacar(valor: Double): Boolean {
    if (saldo - valor >= 0.0) {
      saldo -= valor;
      return true;
    }

    return false;
  }

}


fun testaCondicoes(saldo: Double) {
  when {
    saldo > 1000 -> println("Tá com dinheiro hein!");
    saldo == 0.00 -> println("Tá zerado!");
    saldo >= 500 && saldo <= 1000 -> println("Tá na média!");

    else -> println("nem sei");
  }
}