package com.highway.nested;

public class NestedDemo {
	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.isValid(-10));
		System.out.println(b.isValid(10));
	}
}
