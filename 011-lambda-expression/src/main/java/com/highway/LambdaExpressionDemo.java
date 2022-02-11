package com.highway;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

interface Drivable{
	void drive(String name);
}

class Car {
	public static void drive(String name) {
		System.out.println("User are driving " + name);
	}
}
public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Drivable drivable = Car::drive;
		drivable.drive("Truck");
		
		List<String> messages = Arrays.asList("java","react","sql","docker");
		messages.forEach(System.out::println);
	}
}
