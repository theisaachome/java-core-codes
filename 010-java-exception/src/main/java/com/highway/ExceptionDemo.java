package com.highway;

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			int d=0;
			int a = 42/d;
			System.out.println(a);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception" +e);
		}
//		catch(ArithmeticException e) {}
		
		System.out.println("Finish execution.");
	}
}
