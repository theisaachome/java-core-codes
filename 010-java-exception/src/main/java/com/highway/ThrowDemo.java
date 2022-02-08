package com.highway;

class PersonValidator{
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Must be 18+");
		}else {
			System.out.println("Good job.");
		}
	}
}
public class ThrowDemo {
	static void demo() {
		try {
			throw new NullPointerException("demo method");
		} catch (NullPointerException e) {
			System.out.println("Caugth inside the demo().");
			throw e;
		}
	}
	public static void main(String[] args) {
		try {
			demo();
		} catch (NullPointerException e) {
			System.out.println("Recaught "+e);
		}
		PersonValidator.validate(17);
	}
}
