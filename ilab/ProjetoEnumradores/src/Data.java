public class Data {

    private int dia;
    private Meses mes;
    private int ano;

    public Data(int dia, Meses mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    public boolean ehOMesAtual(Meses mes) {
        return this.mes.equals(mes);
    }
}
