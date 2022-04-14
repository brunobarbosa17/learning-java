public class MinhaThread extends Thread {

  private int num;
  private int tempoEspera;

  public MinhaThread(int num, int tempoEspera) {
    this.num = num;
    this.tempoEspera = tempoEspera;
  }


  @Override
  public void run() {
    for (int i=0; i<10; i++) {
      try {
        System.out.println("Thread #" + num + "     IT :" + i);
        Thread.sleep(tempoEspera);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
  }
}
