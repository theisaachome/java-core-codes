package com.isaachome;

import java.util.ArrayList;
import java.util.Spliterator;

public class SliteratorDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Aung Aung");
		al.add("Maw Maw");
		al.add("Thaw Thaw");
		
		Spliterator<String> siter=al.spliterator();
		while(siter.tryAdvance((s)->System.out.println(s)));
		System.out.println();
	}
}
