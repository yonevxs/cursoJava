package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> studentsA = new HashSet<>();
		Set<Student> studentsB = new HashSet<>();
		Set<Student> studentsC = new HashSet<>();
		
		System.out.print("How many students for course A: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			studentsA.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			studentsB.add(new Student(sc.nextInt()));
		}
		
		System.out.print("How many students for course B: ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			studentsC.add(new Student(sc.nextInt()));
		}
		
		Set<Student> totalStudents = new HashSet<>(studentsA);
		totalStudents.addAll(studentsB);
		totalStudents.addAll(studentsC);	
		System.out.println("Total Students: " + totalStudents.size());
		
		sc.close();

	}

}
