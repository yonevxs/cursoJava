package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.entities.DomesticTransaction;
import model.entities.InternationalTransaction;
import model.entities.Transaction;
import model.enums.PaymentMethod;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o caminho do arquivo desejado: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Transaction> transactions = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String id = fields[1];
				String email = fields[2];
				Double grossAmount = Double.parseDouble(fields[3]);
				PaymentMethod paymentMethod = PaymentMethod.valueOf(fields[4]);
				
				if("DOMESTIC".equalsIgnoreCase(fields[0])) {
					transactions.add(new DomesticTransaction(id, email, grossAmount, paymentMethod, Double.parseDouble(fields[5])));
				} else {
					transactions.add(new InternationalTransaction(id, email, grossAmount, paymentMethod, Double.parseDouble(fields[5]), Double.parseDouble(fields[6])));
				}
				
				line = br.readLine();
			}
			
			transactions.forEach(System.out::println);
			
			System.out.println("");
			
			System.out.println("Somatória de todas as transações feitas com cartão de crédito: ");
			double creditSum = transactions.stream().filter(p -> p.getPaymentMethod().equals(PaymentMethod.CREDIT_CARD)).map(p -> p.netAmount()).reduce(0.0, Double::sum);
			System.out.println(String.format(Locale.US, "%.2f", creditSum));
			
			double avg = transactions.stream().map(p -> p.netAmount()).reduce(0.0, (x, y) -> x + y / transactions.size());
			double media = transactions.stream().mapToDouble(Transaction::netAmount).average().orElse(0.0);		
			System.out.println("Média das transações: R$" +  String.format("%.2f", avg));
			
			System.out.println("");
			
			List<String> emailsAcimaMedia = transactions.stream().filter(p -> p.netAmount() > avg).map(p -> p.getClientEmail()).distinct().sorted().collect(Collectors.toList());
			System.out.println("E-mails de clientes com transações acima da média: ");
			emailsAcimaMedia.forEach(System.out::println);
			
			double maiorValor = transactions.stream().mapToDouble(Transaction::netAmount).max().orElse(0.0);
			
			System.out.println("Transação com maior valor liquído: " + maiorValor);
			
			System.out.println("Digite o caminho do arquivo de saída: ");
			String outPath = sc.nextLine();
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(outPath))){
				bw.write("ID,Email,ValorLiquido");
				bw.newLine();
				
				for(Transaction t : transactions) {
					String lineOut = String.format(Locale.US, "%s,%s,%.2f", t.getId(), t.getClientEmail(), t.netAmount());
					bw.write(lineOut);
			        bw.newLine();
				}
				System.out.println("Arquivo gravado com sucesso em: " + outPath);
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
