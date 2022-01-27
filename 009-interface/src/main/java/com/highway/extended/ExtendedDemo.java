package com.highway.extended;

interface A{
	void method1();
	void method2();
}
interface B extends A{
	void method3();
}

class Client implements B{

	@Override
	public void method1() {
		System.out.println("Method 1");
	}

	@Override
	public void method2() {
		System.out.println("Method 2");		
	}

	@Override
	public void method3() {
		System.out.println("Method 3");		
	}
	
}
public class ExtendedDemo {
	public static void main(String[] args) {
		Client client = new Client();
		client.method1();
		client.method2();
		client.method3();
	}

}
