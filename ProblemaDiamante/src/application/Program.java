package application;

import devices.ComboDevice;
import devices.ConcratePrinter;
import devices.ConcrateScanner;

public class Program {

	public static void main(String[] args) {
		ConcratePrinter p = new ConcratePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcrateScanner s = new ConcrateScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My Dissertation");
		c.print("My Dissertation");
		System.out.println("Scan result: " + c.scan());
	}

}
