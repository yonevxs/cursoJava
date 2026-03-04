package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	public static double converterWithIOF(double dolar, double dolarPrice) {
		return (dolar * dolarPrice) + ((dolar * dolarPrice)* IOF);
	}

}
