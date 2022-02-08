package com.highway;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		try {
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			
		}
		finally {
			System.out.println("finally block");
		}
	}
}
