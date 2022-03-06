import java.util.Date;

import entites.Pedido;
import enums.OrderStatus;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido(1080, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);

        System.out.println(pedido);

        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
