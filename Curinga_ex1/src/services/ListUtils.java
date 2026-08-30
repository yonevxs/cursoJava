package services;

import java.util.List;

public class ListUtils {
	public static void printList(List<?> list) {
		for(Object l : list) {
			System.out.println(l);
		}
	}
}
