public class Main {
  public static void main(String[] args) {

    MinhaThread t1, t2, t3;
    t1 = new MinhaThread(1, 1000);
    t2 = new MinhaThread(2, 1300);
    t3 = new MinhaThread(3, 1800);

    t1.start();
    t2.start();
    t3.start();

    try {
      t1.join();
      t2.join();
      t3.join();
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    System.out.println("Finished");
  }
}
