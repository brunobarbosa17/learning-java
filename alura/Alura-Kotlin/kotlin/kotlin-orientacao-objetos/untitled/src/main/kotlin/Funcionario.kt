class Funcionario(
    val nome:String,
    val cpf: String,
    val salario: Double,
    val tipo: Int) {

    fun bonificacao(): Double {
        return salario * 0.1;
    }
}