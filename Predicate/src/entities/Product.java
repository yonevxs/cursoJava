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

	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.00;
	}
	
	public boolean nonStaticProductPredicate() { // Esse método vai trabalhar com o Product que estou usando, não o do argumento, então deixamos vazio
		return price >= 100.00; // Vai pegar o objeto atual na memória, seria isso?
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
}
