import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        String[] textoSeparado = texto.split(" ");
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();

        for (int i = 0; i < textoSeparado.length; i++) {
            mapa.put(i, new String(textoSeparado[i]));
        }

        HashMap<Integer, String> quantidadePalavras = new HashMap<Integer, String>();
        int qntd = 0;
        for (int i = 0; i < textoSeparado.length; i++) {
            for (int j = 0; j < textoSeparado.length; j++) {
                if(mapa.containsValue(new String(textoSeparado[i]))) {
                    quantidadePalavras.put(qntd, new String(textoSeparado[i]));
                }
            }
            qntd = 0;
        }

        System.out.println(quantidadePalavras);
    }
}
