package model.entities;

import java.time.LocalDate;

public class ServiceContract extends Document{
	private Double discount;

	public ServiceContract(String id, LocalDate date, double baseAmount, Double discount) {
		super(id, date, baseAmount);
		this.discount = discount;
	}
	
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	@Override
	public Double total() {
		return getBaseAmount() - discount;
	}
	
}
