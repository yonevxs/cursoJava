package model.entities;

import java.util.Locale;

import model.enums.PaymentMethod;
import model.exceptions.DomainException;

public class DomesticTransaction extends Transaction{
	
	private Double stateTax;
	
	public DomesticTransaction(String id, String clientEmail, Double grossAmount, PaymentMethod paymentMethod, Double stateTax) {
		super(id, clientEmail, grossAmount, paymentMethod);
		if(stateTax < 0.0) {
			throw new DomainException("A taxa estadual não pode ser negativa!");
		}
		this.setStateTax(stateTax);
	}

	public Double getStateTax() {
		return stateTax;
	}

	public void setStateTax(Double stateTax) {
		if (stateTax < 0.0) {
            throw new DomainException("A taxa estadual não pode ser negativa!");
        }
        this.stateTax = stateTax;
	}
	
	@Override
	public Double netAmount() throws DomainException {
		if(getPaymentMethod() == PaymentMethod.PIX) {
			return (grossAmount + stateTax) - (grossAmount + stateTax) * 0.05;
			
		}
		return grossAmount + stateTax;
	}
	
	@Override
	public String toString() {
		return id + " | " + clientEmail + " | R$" + String.format(Locale.US, "%.2f", grossAmount)
				+ " | Payment Method:" + paymentMethod + " | State Tax: R$" + String.format(Locale.US, "%.2f", stateTax);
	}
	
}
