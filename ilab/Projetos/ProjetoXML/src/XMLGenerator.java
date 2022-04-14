import java.lang.reflect.Field;

public class XMLGenerator {
  public static String generateXML(Object obj) {

    StringBuilder str = new StringBuilder();

    str.append("<xml>");

    try {
      // vamos tratar apenas com a visão dos atributos
      for (Field f : obj.getClass().getDeclaredFields()) {
        f.setAccessible(true);
        str.append("<" + f.getName() + "> " + f.get(obj) + "</" + f.getName() + ">");
        f.setAccessible(false);

      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    str.append("</xml>");
    return str.toString();

  }
}