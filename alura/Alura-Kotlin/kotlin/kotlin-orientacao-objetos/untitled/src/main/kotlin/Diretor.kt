class Diretor(
    nome:String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override val getBonificacao: Double get() = salario + plr;

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}