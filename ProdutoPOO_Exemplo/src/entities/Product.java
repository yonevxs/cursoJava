package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return quantity * price;
	}
	
	public void addProducts(int quantity) {
		// referência o atributo da classe
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
		return "Dados do produto: " + name + ", $" + String.format("%.2f", price) + ", " + quantity + " unidades, " + "Total: $" + String.format("%.2f", totalValueInStock());
	}
}
