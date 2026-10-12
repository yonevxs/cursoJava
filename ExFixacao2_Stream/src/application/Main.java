package application;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.entities.Transaction;
import model.enums.TransactionType;

public class Main {

	public static void main(String[] args) {
		ArrayList<Transaction> list = new ArrayList<>();
		
		list.add(new Transaction("001", TransactionType.CREDIT, new BigDecimal("200.0")));
		list.add(new Transaction("002", TransactionType.CREDIT, new BigDecimal("147.90")));
		list.add(new Transaction("003", TransactionType.DEBIT, new BigDecimal("349.90")));
		list.add(new Transaction("004", TransactionType.CREDIT, new BigDecimal("400.0")));
		list.add(new Transaction("005", TransactionType.DEBIT, new BigDecimal("680.0")));
		list.add(new Transaction("006", TransactionType.CREDIT, new BigDecimal("950.00")));
		
		Map<TransactionType, BigDecimal> byTransactionType= list.stream()
				.collect(Collectors.groupingBy(Transaction::getType, Collectors.reducing(BigDecimal.ZERO, Transaction::getAmount, BigDecimal::add)));
		
		byTransactionType.forEach((k, v) -> System.out.print(k + ": " + v + "\n"));
	}
}
