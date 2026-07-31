package model.entities;

public class Invoice {
	
	private Double basicPayment;
	private Double tax;
	
	public Invoice() {
	}
	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}
	
	public Double getBasicPayment() {
		return basicPayment;
	}
	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}
	
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayement() {
		return getBasicPayment() + getTax(); // Usamos os métodos get para caso colocarmos alguma regra que altere a lógica do valor retornado, não precisarmos mudar 2 métodos
	}
}
