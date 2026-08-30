package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public abstract class Document implements Comparable<Document>{
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String id;
	private LocalDate date;
	private double baseAmount;
	
	public Document(String id, LocalDate date, double baseAmount) {
		if(baseAmount <= 0.0) {
			throw new DomainException("Amount must be positive!");
		}
		this.id = id;
		this.date = date;
		this.baseAmount = baseAmount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}
	public abstract Double total();
	
	@Override
	public int compareTo(Document other) {
		return total().compareTo(other.total());
	}
	
	@Override
	public String toString() {
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    return "ID: " + id 
	            + ", Date: " + date.format(fmt) 
	            + ", Total: $" + String.format("%.2f", total());
	}
}
