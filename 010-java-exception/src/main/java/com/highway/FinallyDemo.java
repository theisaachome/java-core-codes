package com.highway;

public class FinallyDemo {

	static void method1() {
		try {
			System.out.println("Inside Method1");
			throw new RuntimeException("Demo Error");
		} finally {
			System.out.println("inside Method1 finally.");
		}
	}

	static void method2() {
		try {
			System.out.println("Inside Method2");
			return;
		} finally {
			System.out.println("inside Method2 finally.");
		}
	}

	static void method3() {
		try {
			System.out.println("Inside Method3");
			
		} finally {
			System.out.println("inside Method3 finally.");
		}
	}
	
	public int testMe() {
		try {
			
			String[] sArray = {"Aung Aung","Kyaw Kyaw"};
			System.out.println(sArray[10]);
		} catch (Exception e) {
			return 10;
		}
		
		finally {
			return 20;
		}
	}

	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught.");
		}
		method2();
		method3();
		
		System.out.println(new FinallyDemo().testMe());
	}
}
