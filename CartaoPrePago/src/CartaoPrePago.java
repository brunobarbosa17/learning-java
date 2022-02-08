
public class CartaoPrePago {
	private String numeroCartao;
	private String nomeTitular;
	private int anoValidade;
	private int mesValidade;
	private double saldo;
	
	
	public CartaoPrePago(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo) {
		setNumeroCartao(numeroCartao);
		setNomeTitular(nomeTitular);
		setAnoValidade(anoValidade);
		setMesValidade(mesValidade);
		setSaldo(saldo);
	}
	
	public String getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAnoValidade() {
		return anoValidade;
	}
	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}
	public int getMesValidade() {
		return mesValidade;
	}
	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void adicionarCredito(double valor) {
		setSaldo(valor);
	}
	
	public boolean comprar(double valor) {
		if (getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
			return true;
		} else {
			return false;
		}
	}
	
	
}
