class testaFuncionarios {

    private fun testaFuncionario() {
        val funcionario = Analista(
            "Bruno",
            "124.31.12.1",
            5000.0
        )

        val gerente = Gerente(
            "Bruno Gerente",
            "12223.13.31.31",
            6000.0,
            123
        )

        val calculadoraBonificacao = CalculadoraBonificacao()
        calculadoraBonificacao.registra(funcionario)
        calculadoraBonificacao.registra(gerente)


        val maria = Analista("Maria", "1.31.3..134", 3000.0)

        calculadoraBonificacao.registra(maria)
        println("Total bonificação: ${calculadoraBonificacao.total}")
    }

}