package com.highway;

public class SimpleDemo {
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		System.out.println("Version " + obj.VERSION);
		obj.drive("BWM");
	}
}
