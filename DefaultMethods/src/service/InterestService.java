package service;

import java.security.InvalidParameterException;

public interface InterestService {
	double getInterestRate();
	
	// O método payment() tem o mesmo comportamento em ambas as classes, então criamos o default method para melhor aproveitamento
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
}
