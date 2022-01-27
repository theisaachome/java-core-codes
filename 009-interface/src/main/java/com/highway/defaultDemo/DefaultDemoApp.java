package com.highway.defaultDemo;

interface Flyable{
	void fly();
	default void move() {
		System.out.println("default Moving method...");
	}
}
interface Transformable{
	void transform();
}

class  Duck implements Flyable{
	@Override
	public void fly() {
		System.out.println("I am flying bae");
	}
}

public class DefaultDemoApp {
	public static void main(String[] args) {
		Flyable obj= new Duck();
		obj.fly();
		obj.move();
	}
}
