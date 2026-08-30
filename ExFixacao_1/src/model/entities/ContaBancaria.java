package model.entities;

public class ContaBancaria {
	private double saldo;
	
	public ContaBancaria() {}

	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void sacar(double valor) throws SaldoInsuficienteException{
		if(saldo < valor) {
			throw new SaldoInsuficienteException("O valor de saque é maior que o saldo atual! \n Saldo atual: " + getSaldo());
		}
		saldo = saldo - valor;
		System.out.println("Saque realizado! \n Saldo Atual: " + getSaldo());
	}
}
