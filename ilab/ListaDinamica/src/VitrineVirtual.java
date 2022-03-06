import java.util.ArrayList;

public class VitrineVirtual {
    public static void main(String[] args) {

        ArrayList<Produto> lista;
        lista = new ArrayList<Produto>();
        lista.add(new Produto(1, "Produto 1", 100));
        lista.add(new Produto(2, "Produto 2", 200));
        lista.add(new Produto(3, "Produto 3", 300));

        for (Produto p: lista) {
            System.out.println(p);
        }

        System.out.println(lista.get(2));
        System.out.println(lista.toArray()[0]);
    }
}
