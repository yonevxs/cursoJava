package entities;

public abstract class Pessoa {
	protected String nome;
	protected Double renda_anual;
	
	public Pessoa() {
		
	}
	public Pessoa(String nome, Double renda_anual) {
		this.nome = nome;
		this.renda_anual = renda_anual;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getRendaAnual() {
		return renda_anual;
	}
	public void setRendaAnual(Double renda_anual) {
		this.renda_anual = renda_anual;
	}
	
	public abstract Double imposto();
	
	@Override
	public String toString() {
		return nome + " - R$" + String.format("%.2f", renda_anual);
	}
}
