
public class Program {
	public static void main(String[] args) {
		ContaBancaria contaBruno = new ContaBancaria(1234, "Bruninho", 12355643, 0, 1000);
		
		contaBruno.depositarNaConta(500);
		contaBruno.getDadosDaConta();
	}
}
