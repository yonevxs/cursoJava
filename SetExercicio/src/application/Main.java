package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.UserLog;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ISO_INSTANT;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Set<UserLog> set = new HashSet<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(" ");
				String username = fields[0];
				Instant moment = Instant.parse(fields[1]);
				
				set.add(new UserLog(username, moment));
				
				line = br.readLine();
			}
			
			System.out.println("Total users: " + set.size());
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();
	}
}
