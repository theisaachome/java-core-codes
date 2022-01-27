package com.highway.basic;

class Person{
	String name;
	String address;
	
	Person(){}
	Person(String name,String address){
		this.name=name;
		this.address = address;
	}
	void showInfo() {
		System.out.printf("Name : %s\nAddress : %s\n",name,address);
		System.out.println();
	}
}
class Teacher extends Person{
	
	String job;
	
	Teacher(String n,String ad, String job){
		name=n;
		address=ad;
		this.job=job;
	}
	
	void showInfo() {
		System.out.printf("Name : %s\nAddress : %s\nJob : %s\n",name,address,job);
		System.out.println();
	}
}
class Driver extends Person{
	String drivingBus;
	Driver(String name,String address,String drivingBus){
		super(name,address);
		this.drivingBus=drivingBus;
	}
	void showDetail() {
		System.out.printf("Name : %s\nAddress : %s\nDriving Bus : %s\n",name,address,drivingBus);
		System.out.println();
	}
	
}
public class SimpleInheritanceDemo {
	public static void main(String[] args) {
		Person person = new Person();
		person.name="John";
		person.address="England";
		person.showInfo();
		
		Teacher teacher = new Teacher("Mike", "Yangon", "Drummer");
		teacher.showInfo();
		Driver driver = new Driver("Kyaw Kyaw", "Yangon", "YBS 79");
		driver.showDetail();
	}

}
