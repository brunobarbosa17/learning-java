class ContaCorrente(
    titular: String,
    numero: Int) : Conta(titular, numero) {

    override fun sacar(valor: Double): Boolean {
        val valorComTaxa = valor + 0.1;
        return super.sacar(valorComTaxa)
    }
}