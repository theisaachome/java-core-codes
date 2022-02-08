package com.highway;

public class ThrowsDemo {
	static void getInfo() throws IllegalAccessException{
		System.out.println("Inside Get Eror Method.");
		throw new IllegalAccessException("Throw Eror");
	}
	public static void main(String[] args) {
		try {
			getInfo();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
