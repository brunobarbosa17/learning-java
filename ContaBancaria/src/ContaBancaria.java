
public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private int cpfTitular;
	private int tipoConta;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String nomeTitular, int cpf, int tipo, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpf;
		this.tipoConta = tipo;
		this.saldo = saldo;
	}
 	
	public void getDadosDaConta() {
		String tipo = "";
		switch (this.tipoConta) {
		case 0:
			tipo = "corrente";
			break;
		case 1:
			tipo = "poupança";
			break;			
		case 2:
			tipo = "investimento";
			break;
		default:
			break;
		}
		
		System.out.println("Número da conta: " + this.numeroConta);
		System.out.println("Nome do Titular: " + this.nomeTitular);
		System.out.println("CPF do Titular: " + this.cpfTitular);
		System.out.println("O tipo da conta é :" + tipo);
		System.out.println("O saldo da conta é: " + saldo);
	}
	
	public void depositarNaConta(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean sacarDaConta(double valorSaque) {
		if (this.saldo >= valorSaque) {
			this.saldo -= valorSaque;
			return true;
		} else {
			return false;
		}
	}
	
}
