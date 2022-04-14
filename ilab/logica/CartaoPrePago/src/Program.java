import javax.swing.JOptionPane;


public class Program {
	public static void main(String[] args) {
		CartaoPrePago cartaoBruno = new CartaoPrePago("1234", "Bruno Barbosa", 2026, 9, 100);
		cartaoBruno.adicionarCredito(200);
		
		int opcao = 0;
		
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 - para adicionar credito\n Digite 2 - para fazer uma compra"));
			if (opcao == 1) {
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de crédito que deseja adicionar: "));
				cartaoBruno.adicionarCredito(valor);
				JOptionPane.showConfirmDialog(null, "Crédito de " + valor + " adicionado com sucesso!\n" + "Novo saldo de R$" + cartaoBruno.getSaldo());
			}
			
			if (opcao == 2) {
				int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da compra que deseja realizar: "));
				if (cartaoBruno.comprar(valor)) {
					JOptionPane.showConfirmDialog(null, "Compra de " + valor + " realizada com sucesso!\n" + "Novo saldo de R$" + cartaoBruno.getSaldo());					
				} else {
					JOptionPane.showMessageDialog(null, "Compra recusada!");					
				}
			}
		} while(opcao != 0);
		
		cartaoBruno.exibirDados();
	}
}
