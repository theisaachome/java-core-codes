package com.highway;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Computer{
	private String name;
	public Computer(String name) {
		this.name= name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Brand : " + this.name;
	}
	
}
public class ConstructorReferenceDemo {
	public static void main(String[] args) {
		List<String> computerBrands = Arrays.asList("Apple","Dell","Samsung","Acer","Lenovo");
		
		var obj=computerBrands.stream()
		.map(Computer::new);
		obj.forEach(System.out::println);
		
	}

}
