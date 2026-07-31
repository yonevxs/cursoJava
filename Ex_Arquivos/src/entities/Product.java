package entities;

public class Product {
	private String nome;
	private Double preco_unitario;
	private Integer quantidade;
	
	public Product() {
	
	}
	public Product(String nome, Double preco_unitario, Integer quantidade) {
		this.nome= nome;
		this.preco_unitario = preco_unitario;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPrecoUnitario() {
		return preco_unitario;
	}
	public void setPrecoUnitario(Double preco_unitario) {
		this.preco_unitario = preco_unitario;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Double valorTotal() {
		return preco_unitario * quantidade;
	}
	
	public String toString() {
		return nome + ", " + String.format("%.2f", preco_unitario) + ", " + quantidade;
	}
}
