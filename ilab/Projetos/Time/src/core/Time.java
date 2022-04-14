package core;

public class Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public void setTime(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String exibirHoraUniversal() {
		return this.hora + ":" + this.minuto + ":" + this.segundo;
	}
	
	public String exibirHoraPadrao() {
		String codigo = (hora > 12) ? "PM" : "AM";
		int horaRetorno = (this.hora > 12) ? this.hora - 12 : this.hora;
		return horaRetorno + ":" + this.minuto + ":" + this.segundo + " " + codigo;
	}
	
	
	
}
