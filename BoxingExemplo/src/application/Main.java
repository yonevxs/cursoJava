package application;

public class Main {

	public static void main(String[] args) {
		
		int x = 20;
		
		// Ou Integer obj
		Object obj = x;
		
		System.out.println(obj);
		
		// Caso fosse Integer, não seria necessário fazer o casting
		int y = (int) obj;
		System.out.println(y);

	}

}
