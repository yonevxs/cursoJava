package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Document;
import model.entities.Invoice;
import model.entities.ServiceContract;
import model.exceptions.DomainException;
import model.services.CalculationService;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Object> history = new ArrayList<>();
		List<Document> docs = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String lineCSV = br.readLine();
			
			while (lineCSV != null) {
				String fields[] = lineCSV.split(",");
				
				String type = fields[0];
				String id = fields[1];
				String data = fields[2];
				
				LocalDate dataFormatada = LocalDate.parse(data, df);
				Double baseAmount = Double.parseDouble(fields[3]);
				Double additionalValue = Double.parseDouble(fields[4]);
				
				if("INVOICE".equalsIgnoreCase(type)) {
					docs.add(new Invoice(id, dataFormatada, baseAmount, additionalValue));
				} else if("CONTRACT".equalsIgnoreCase(type)){
					docs.add(new ServiceContract(id, dataFormatada, baseAmount, additionalValue));
				}
				
				lineCSV = br.readLine();
			}
			
			CalculationService.copy(docs, history);
			System.out.println(CalculationService.max(docs));
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		catch (DomainException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}
