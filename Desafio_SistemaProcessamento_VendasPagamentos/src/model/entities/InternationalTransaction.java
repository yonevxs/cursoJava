package model.entities;

import java.util.Locale;

import model.enums.PaymentMethod;
import model.exceptions.DomainException;

public class InternationalTransaction extends Transaction{
	private Double importDuty;
	private Double iofFee;
	
	public InternationalTransaction(String id, String clientEmail, Double grossAmount, PaymentMethod paymentMethod, Double importDuty, Double iofFee) {
		super(id, clientEmail, grossAmount, paymentMethod);
		if (importDuty < 0.0 || iofFee < 0.0) {
            throw new DomainException("As taxas de importação e IOF não podem ser negativas!");
        }
		this.importDuty = importDuty;
		this.iofFee = iofFee;
	}

	public Double getImportDuty() {
		return importDuty;
	}

	public void setImportDuty(Double importDuty) {
		if (importDuty < 0.0) {
            throw new DomainException("A taxa de importação não pode ser negativa!");
        }
		this.importDuty = importDuty;
	}

	public Double getIofFee() {
		return iofFee;
	}

	public void setIofFee(Double iofFee) {
		if (iofFee < 0.0) {
            throw new DomainException("O IOF não pode ser negativo!");
        }
		this.iofFee = iofFee;
	}

	@Override
	public Double netAmount() throws DomainException {
		if(getPaymentMethod() == PaymentMethod.CREDIT_CARD) {
			return getGrossAmount() + getImportDuty() + getIofFee() + 15.00;
		}
		return getGrossAmount() + getImportDuty() + getIofFee();
	}
	
	@Override
	public String toString() {
		return id + " | " + clientEmail + " | R$" + String.format(Locale.US, "%.2f", grossAmount)
				+ " | Payment Method: " + paymentMethod + " | Import Duty: R$" + String.format(Locale.US, "%.2f", importDuty) +
				" | IOF Fee: R$" + String.format(Locale.US, "%.2f", iofFee);
	}
	
}
