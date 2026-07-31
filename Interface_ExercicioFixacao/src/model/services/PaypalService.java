package model.services;

public class PaypalService implements OnlinePaymentService{
	
	public Double paymentFee(Double amount) { // Taxa de pagamento
		return amount * 0.02;
	}
	
	public Double interest(Double amount, Integer months) { //Juros
		return amount * 0.01 * months;
	}
}
