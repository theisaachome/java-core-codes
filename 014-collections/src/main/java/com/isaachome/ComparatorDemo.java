package com.isaachome;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
//		return o2.compareTo(o1);
		return o1.compareTo(o2);
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<String>(new MyComparator());
		list.add("C");
		list.add("E");
		list.add("A");
		list.add("B");
		list.add("D");
		list.add("F");
		
		list.forEach(System.out::println);
	}
	public static void reversed() {
		
	}
}
