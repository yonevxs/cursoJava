package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import services.NumberUtils;

public class Main {

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(5, 10, 15);
		List<Double> listDouble = Arrays.asList(2.5, 7.5);
		
		List<Object> listDestino = new ArrayList<>();
		
		System.out.println(NumberUtils.calcularMedia(listInt));
		System.out.println(NumberUtils.calcularMedia(listDouble));
		
		NumberUtils.copiarNumeros(listDouble, listDestino);
		System.out.println(listDestino);
	}

}
