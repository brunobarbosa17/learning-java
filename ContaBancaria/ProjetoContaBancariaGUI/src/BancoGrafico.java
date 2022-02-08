import javax.swing.JOptionPane;

public class BancoGrafico {
	public static void main(String[] args) {
		int opcao;
		double valor;
		String texto;
		ContaBancaria conta = new ContaBancaria(1334, "Bruno", 1234, 0, 1000);
		
		do {
			texto = JOptionPane.showInputDialog("Digite 1 - Deposito\n 2 - Saque\n 3 - Informações");
			opcao = Integer.parseInt(texto);
			
			switch (opcao) {
				case 1:
					texto = JOptionPane.showInputDialog("Digite o valor a depositar: ");
					valor = Double.parseDouble(texto);
					conta.depositarNaConta(valor);
					break;
				case 2:
					texto = JOptionPane.showInputDialog("Digite o valor a sacar: ");
					valor = Double.parseDouble(texto);
					if (conta.sacarDaConta(valor)) {
						JOptionPane.showMessageDialog(null, "Saque Efetuado");
					} else {
						JOptionPane.showMessageDialog(null, "Saldo insuficiente!", "Débito não autorizado!", JOptionPane.ERROR_MESSAGE);
					}
				break;
				case 3:
					JOptionPane.showMessageDialog(null, conta.getDadosDaConta());
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcao invalida!!!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}
		} while (opcao != 0);
	}
}
