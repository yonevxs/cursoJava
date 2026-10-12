package model.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Order {
	private List<OrderItem> items;

	public Order(List<OrderItem> items) {
		this.items = new ArrayList<>(items);
	}

	public List<OrderItem> getItems() {
		return Collections.unmodifiableList(items);
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order: \n");
		
		for(int i = 0; i < items.size(); i++) {
			sb.append(items.get(i).toString());
			if (i < items.size() - 1) {
				sb.append(",\n");
			}
		}
		
		return sb.toString();
	}
}
