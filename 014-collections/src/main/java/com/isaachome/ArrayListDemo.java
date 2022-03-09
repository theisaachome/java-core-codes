package com.isaachome;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial al size : " +al.size());
		al.add("Aung Aung");
		al.add("Thaw Thaw");
		al.add("Maw Maw");
		al.add("Tun Tun");
		
		System.out.println("After adding al size : " +al.size());
		
		al.add(1, "Tun Kyaw Oo");
		System.out.println("Contents of al : " + al);
		
		al.remove(0);
		al.remove("Tun Tun");

		System.out.println("After Removing al size : " +al.size());
		System.out.println("After Removing Content of al : " + al);
		
	}
}
