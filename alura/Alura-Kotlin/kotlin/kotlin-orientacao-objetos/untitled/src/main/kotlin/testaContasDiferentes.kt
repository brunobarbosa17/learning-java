class testaContasDiferentes {


    private fun testaContasDiferentes() {
        val contaCorrente = ContaCorrente(
            "Alex",
            1000
        )

        val contaPoupanca = ContaPoupanca(
            "Fran",
            1001
        )

        contaCorrente.deposita(1000.0)
        contaPoupanca.deposita(1000.0)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")

        contaCorrente.sacar(100.0)
        contaPoupanca.sacar(100.0)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")

        contaCorrente.transfere(100.0, contaPoupanca)

        println("saldo corrente ${contaCorrente.saldo}")
        println("saldo poupança ${contaPoupanca.saldo}")
    }


}