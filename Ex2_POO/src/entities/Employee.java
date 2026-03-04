package entities;

public class Employee {
	public String name;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentarSalario(double percentual) {
		this.salarioBruto = salarioBruto + ((salarioBruto * percentual) / 100);
	}
	
	public String toString() {
		return "Employee: " + name + ", $" + salarioLiquido(); 
	}
}
