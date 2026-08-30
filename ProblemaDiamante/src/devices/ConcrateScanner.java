package devices;

public class ConcrateScanner extends Device implements Scanner{ // Herda de Device e também implementa a interface Scanner
	
	public ConcrateScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
}
