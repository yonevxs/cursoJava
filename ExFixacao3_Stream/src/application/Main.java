package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.entities.Order;
import model.entities.OrderItem;
import model.entities.Product;

public class Main {
	public static void main(String[] args) {
		List<Order> orders = new ArrayList<>();
		List<OrderItem> orderItem = new ArrayList<>();
		
		List<OrderItem> order1 = new ArrayList<>();
		order1.add(new OrderItem(1, 500.0, new Product("Teclado Gamer", 500.0)));
		order1.add(new OrderItem(1, 1000.0, new Product("Gabinete Corsair", 1000.0)));
		order1.add(new OrderItem(1, 1000.0, new Product("Monitor LG", 1200.0)));
		order1.add(new OrderItem(2, 500.0, new Product("Boneco Funko Pop", 250.0)));
		order1.add(new OrderItem(2, 500.0, new Product("Boneco Funko Pop", 250.0)));

		List<OrderItem> order2 = new ArrayList<>();
		order2.add(new OrderItem(2, 500.0, new Product("Boneco Funko Pop", 250.0)));
		order2.add(new OrderItem(2, 600.0, new Product("Boneco Funko Pop", 300.0)));
		order2.add(new OrderItem(2, 800.0, new Product("Boneco Funko Pop", 400.0)));

		orders.add(new Order(order1));
		orders.add(new Order(order2));   
		
		
		orders.forEach(System.out::println);
		System.out.println("");
		
		List<Product> stream1 = orders.stream().flatMap(order -> order.getItems().stream()).map(OrderItem::getProduct)
				.distinct()
				.sorted(Comparator.comparing(Product::getPrice).reversed()).limit(3)
				.toList();
		 
		stream1.forEach(System.out::println);
	}
}
