package entities;

public class Product {
	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static void staticPriceUpdate(Product p) { // método estático não mexe com o próprio objeto, e sim como o objeto em parametro
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() { // Mexe com o price do próprio objeto (em memória)
		setPrice(getPrice() * 1.1);
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}
}
