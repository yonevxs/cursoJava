package model.entities;

import java.util.Locale;
import java.util.Objects;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return product + " | Qtd: " + quantity + " | R$" + String.format(Locale.US, "%.2f", price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, product, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(price, other.price) && Objects.equals(product, other.product)
				&& Objects.equals(quantity, other.quantity);
	}
}
