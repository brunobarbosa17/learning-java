public class TesteSistema {
  public static void main(String[] args) {

    Gerente g = new Gerente();
    g.setSenha(22242);

    Administrador adm = new Administrador();
    adm.setSenha(2222);

    Designer d = new Designer();
    SistemaInterno si = new SistemaInterno();
    si.autentica(g);
    si.autentica(adm);

  }
}
