package model.services;

import java.util.List;

public class CalculationService {
	public static <T extends Comparable<T>> T max(List<T> list){
		if(list.isEmpty()) {
			throw new IllegalStateException("List must be contain values");
		}
		
		T max = list.get(0);
		for(T obj : list) {
			if(obj.compareTo(max) > 0){
				max = obj;
			}
		}
		return max;
	}
	
	public static <T> void copy(List<? extends T> source, List<? super T> target) { // Por que colocar <T> após static?
		for(T obj : source) {
			target.add(obj);
		}
	}
}
