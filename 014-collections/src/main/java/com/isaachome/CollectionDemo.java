package com.isaachome;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
	public static void main(String[] args) {
		List<String> list = List.of("Aung Aung","Zaw Zaw");
//		list.add("Thaw Thaw");
		list.forEach(System.out::println);
		
		List<String> students = List.copyOf(list);
		students.add("new Student");
	}
}
