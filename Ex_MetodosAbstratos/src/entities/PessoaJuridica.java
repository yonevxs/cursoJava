package entities;

public class PessoaJuridica extends Pessoa{
	private Integer n_funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double renda_anual, Integer n_funcionarios) {
		super(nome, renda_anual);
		this.n_funcionarios = n_funcionarios;
	}
	
	public Integer getNFuncionarios() {
		return n_funcionarios;
	}
	public void setNFuncionarios(Integer n_funcionarios) {
		this.n_funcionarios = n_funcionarios;
	}
	
	@Override
	public Double imposto() {
		if(n_funcionarios > 10) {
			return renda_anual * 0.14;
		} else {
			return renda_anual * 0.16;
		}
	}
}
