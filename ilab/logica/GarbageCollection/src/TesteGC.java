public class TesteGC {
    public static void main(String[] args) {
        Produto p = null;
        for (int i = 0; i < 100; i++) {
            p = new Produto(i, "Produto " + i, i * 100);
        }

        System.gc();

        System.out.println("O ultimo produto cadastrado foi...");
        System.out.println(p.getId() + "|" + p.getDescricao() + "|" + p.getPreco());
    }
}
