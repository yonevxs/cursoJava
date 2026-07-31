package program;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		System.out.println(pedido);
		
		OrderStatus order1 = OrderStatus.DELIVERED;
		OrderStatus order2 = OrderStatus.valueOf("DELIVERED");
		System.out.println(order1);
		System.out.println(order2);

	}

}
