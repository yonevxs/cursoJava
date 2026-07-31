package entities;

public class BussinessAccount extends Account{
	// Tem todos os dados e comportamentos da classe Account
	
	private Double loanLimit;
	
	public BussinessAccount() {
		// também podemos colocar super() no construtor padrão, para caso tenha alguma lógica no construtor padrão e queremos repeti-lá
		super();
	}
	
	// Quando instanciarmos uma classe que herda outra, utilizamos a função super() com os argumentos da classe herdada
	public BussinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;	
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {			
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withdraw(Double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
