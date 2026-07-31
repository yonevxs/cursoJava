package entities;

public class PessoaFisica extends Pessoa{
	private Double gastos_saude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double renda_anual, Double gastos_saude) {
		super(nome, renda_anual);
		this.gastos_saude = gastos_saude;
	}
	public Double getGastosSaude() {
		return gastos_saude;
	}
	public void setGastosSaude(Double gastos_saude) {
		this.gastos_saude = gastos_saude;
	}
	
	@Override
	public Double imposto() {
		if(getRendaAnual() < 20000 && gastos_saude == 0) {
			return getRendaAnual() * 0.15;
		} 
		else if(getRendaAnual() > 20000 && gastos_saude == 0) {
			return getRendaAnual() * 0.25;
		} 
		else if(getRendaAnual() < 20000 && gastos_saude != 0){
			return (getRendaAnual() * 0.15) - (gastos_saude * 0.50);
		} else {
			return (getRendaAnual() * 0.25) - (gastos_saude * 0.50);
		}
	}
	
	@Override 
	public String toString() {
		return nome + " - Renda anual: R$" + String.format("%.2f", renda_anual) + " - Gastos com saúde: R$" 
	+ String.format("%.2f", gastos_saude);
	}

}
