public class MeuRecurso implements AutoCloseable {
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        if ( valor == 0) {
            throw new RuntimeException("valor zerado");
        }
        this.valor = valor;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando");
    }
}
