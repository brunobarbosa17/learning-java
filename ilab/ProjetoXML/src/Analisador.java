public class Analisador {
  public static void main(String[] args) {


    Produto p = new Produto(123, "Computador i5 16Gb HD 1Tb", 2500, "computador.jpg");
    Cliente c = new Cliente(10012, "Professor Isidro","isidro@isidro.com", "11-987654321","04/10/1978");

    XMLFileGenerator.generateXMLFile(p);
    XMLFileGenerator.generateXMLFile(c);


  }

}