package com.isaachome;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Double> balances = new HashMap<>();
		balances.put("Aung Aung", 10000.00);
		balances.put("Maw Maw", 12000.00);
		balances.put("Thaw Thaw", 13000.88);
		balances.put("Thida", 9000.00);
		balances.put("Maung Maung", 15000.00);
//		get a set of entry
		Set<Map.Entry<String, Double>> set = balances.entrySet();
		
		for (Map.Entry<String, Double> me : set) {
			System.out.printf("%s : %f \n", me.getKey(),me.getValue());
		}
		System.out.println();
		double newBalance = balances.get("Thida");
		balances.put("Thida",newBalance +100000);
		System.out.println("Thida New Balance : " + balances.get("Thida"));
		
	}
}
