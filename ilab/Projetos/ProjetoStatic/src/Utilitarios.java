public class Utilitarios {

    public static final double PI = 3.14;

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subt(double a, double b) {
        return a - b;
    }

    public static double pot(double b, int e) {
        double pote = 1;
        for (int i = 0; i < e; i++) {
            pote = pote * b;
        }
        return pote;
    }


}
