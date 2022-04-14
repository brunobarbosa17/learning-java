import core.Time;

public class TimeTeste {
	public static void main(String[] args) {
		Time horario = new Time();
		
		horario.setTime(5, 5, 8);
		System.out.println(horario.exibirHoraPadrao());
		System.out.println(horario.exibirHoraUniversal());
	}
}
