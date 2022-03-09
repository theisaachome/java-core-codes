package com.isaachome;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		
		System.out.println(hashSet);
	}
}
