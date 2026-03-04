package entities;

public class ContaBancaria {
	private int numeroConta;
	private String nomeTitular;
	private double saldoConta;
	
	public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		addSaldo(depositoInicial);
		
	}
	public ContaBancaria(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		// saldoConta vai receber 0 por padrão, então não é necessário passar no parâmetro
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void addSaldo(double saldoNovo) {
		this.saldoConta += saldoNovo;
	}
	
	public void saqueSaldo(double qtdSaque) {
		this.saldoConta -= qtdSaque + 5;
	}
	
	public String toString() {
		return "Conta: " + numeroConta + ", Titular: " + nomeTitular + ", Saldo: R$" + saldoConta;
	}

}
