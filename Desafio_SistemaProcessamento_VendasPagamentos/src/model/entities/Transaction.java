package model.entities;

import java.util.Locale;

import model.enums.PaymentMethod;
import model.exceptions.DomainException;

public abstract class Transaction {
	protected String id;
	protected String clientEmail;
	protected Double grossAmount;
	protected PaymentMethod paymentMethod;
	
	public Transaction(String id, String clientEmail, Double grossAmount, PaymentMethod paymentMethod) {
		this.id = id;
		this.clientEmail = clientEmail;
		this.grossAmount = grossAmount;
		this.paymentMethod = paymentMethod;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public Double getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getId() {
		return id;
	}
	
	public abstract Double netAmount() throws DomainException;

	@Override
	public String toString() {
		return id + " | " + clientEmail + " | R$" + String.format(Locale.US, "%.2f", grossAmount)
				+ " | Payment Method=" + paymentMethod;
	}
	
	
}
