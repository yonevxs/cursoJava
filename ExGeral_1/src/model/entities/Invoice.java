package model.entities;

import java.time.LocalDate;

public class Invoice extends Document{
	private Double taxPercent;
	
	public Invoice(String id, LocalDate date, double baseAmount, Double taxPercent) {
		super(id, date, baseAmount);
		this.taxPercent = taxPercent;
	}

	public Double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}
	
	@Override
	public Double total() {
		return getBaseAmount() + (getBaseAmount() * taxPercent / 100);
	}
	
	
	// Não vou colocar o compareTo() que está no Document porque Invoice e ServiceContract são as minhas dependências
	// Logo, não há necessidade de implementar o compareTo nessas classes, já que ambos são documentos (Document)
}
