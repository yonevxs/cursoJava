package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		
		// Para instanciarmos o DAO, chamamos o DaoFactory com o método que desejamos
		// Dessa forma, o programa não conhece a implementação, somente a interface
		// Também é uma forma de fazer Injeção de Dependência - sem explicitar para a implementação
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById() ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment() ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		list.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: seller findAll() ===");
		list = sellerDao.findAll();
		list.forEach(System.out::println);

	}

}
