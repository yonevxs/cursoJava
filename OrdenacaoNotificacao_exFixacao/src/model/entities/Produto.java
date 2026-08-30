package model.entities;

public class Produto implements Comparable<Produto>{
	private String nome;
	private Double preco;
	
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public int compareTo(Produto other) {
		return preco.compareTo(other.getPreco());
	}
	
	@Override
	public String toString() {
		return nome + " | R$" + String.format("%.2f", preco);
	}
}
