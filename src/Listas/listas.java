package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class listas {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		list.add(2, "Victor");

		
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("========================================");
		list.remove(1);
		list.removeIf(x->x.charAt(0) == 'M');
		for(String x: list) {
			System.out.println(x);
		}
		System.out.println("========================================");
		System.out.println(list.indexOf("Maria"));
		
		List<String> result = list.stream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x: result) {
			System.out.println(x);
		}
				
		
	}
}
