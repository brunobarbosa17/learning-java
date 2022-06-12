class testaCondicoes {

    fun testaCondicoes(saldo: Double) {
        when {
            saldo > 1000 -> println("Tá com dinheiro hein!");
            saldo == 0.00 -> println("Tá zerado!");
            saldo >= 500 && saldo <= 1000 -> println("Tá na média!");

            else -> println("nem sei");
        }
    }
}