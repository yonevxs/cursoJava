package model.entities;

import java.math.BigDecimal;

import model.enums.TransactionType;

public class Transaction {
	private String id;
	protected TransactionType type;
	private BigDecimal amount;
	
	public Transaction(String id, TransactionType type, BigDecimal amount) {
		this.id = id;
		this.type = type;
		this.amount = amount;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", type=" + type + ", amount=" + amount + "]";
	}
}
