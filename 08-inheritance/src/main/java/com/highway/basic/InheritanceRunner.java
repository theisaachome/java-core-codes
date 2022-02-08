package com.highway.basic;

public class InheritanceRunner {
	public static void main(String[] args) {
		Dog bobby = new Dog();
		bobby.bark();
		bobby.eat();
		new Dog().bark();
		new Dog().eat();
	}
}
