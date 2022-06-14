class Gerente(
    nome:String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {

    override val getBonificacao: Double get() = salario

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}