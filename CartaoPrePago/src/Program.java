
public class Program {
	public static void main(String[] args) {
		CartaoPrePago cartaoBruno = new CartaoPrePago("1234", "Bruno Barbosa", 2026, 9, 100);
		cartaoBruno.adicionarCredito(200);
		
		if(cartaoBruno.comprar(500)) {
			System.out.println("Compra realizada!");
		} else {
			System.out.println("Compra não autorizada!");
		}
	}
}
