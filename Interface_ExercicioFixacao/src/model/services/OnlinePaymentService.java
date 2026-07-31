package model.services;

public interface OnlinePaymentService {
	
	public Double paymentFee(Double amount); // Taxa de pagamento
	public Double interest(Double amount, Integer months); // Juros
}
