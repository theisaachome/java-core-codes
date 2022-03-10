package com.isaachome;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> product = new HashMap<String, String>();
		product.put("drink", "Water");
		product.put("eat", "Pizza");
		product.put("fruit", "Apple");
		
		product.forEach((k,v)->System.out.println(k + " " + v));
	}
}
