package com.highway;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Person{
	private String name;
	private Integer age;
	
	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
class ComparisonProvider {
	 
    public int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }
}
public class MethodInstanceReferenceDemo {
	public static void main(String[] args) {
		List<Person> students= Arrays.asList(
				new Person("Aung Aung",24),
				new Person("Maung Maung",20),
				new Person("Thaw Thaw",19));
		ComparisonProvider comProvider = new ComparisonProvider();
		Collections.sort(students,comProvider::compareByAge);
		
		students.stream().map(s->s.getName())
		.forEach(System.out::println);
		
	}
}
