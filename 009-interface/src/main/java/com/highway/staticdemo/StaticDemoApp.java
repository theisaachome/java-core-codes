package com.highway.staticdemo;


interface MyInterface{
	void makeCall();
	static void generateInfo() {
		System.out.println("Generating information.....");
	}
}
class MyClass implements MyInterface{

	@Override
	public void makeCall() {
		System.out.println("Making call bae");
	}
	
}
public class StaticDemoApp {
	public static void main(String[] args) {
		MyInterface.generateInfo();
		
	}

}
