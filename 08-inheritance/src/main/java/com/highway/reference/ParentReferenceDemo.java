package com.highway.reference;

class Parent{
	private String name;
	Parent(String name){
		this.name = name;
	}
	void parentMethod() {
		System.out.println("Parent Method..");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
class Child extends Parent{
	private String phone;
	Child(String name,String phone){
		super(name);
		this.phone=phone;
		System.out.println("Child constructor..");
	}
	void  childMethod() {
		System.out.println("child Method...");
	}
	void parentMethod() {
		System.out.println("parent Method in child.");
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}


public class ParentReferenceDemo {
	public static void main(String[] args) {
//		Parent parent ;
//		parent= new Parent();
//		parent.parentMethod();
		var obj = new Child("Aung Aung","0989899");
		obj.parentMethod();
		System.out.println(obj.getName()+ obj.getPhone());
		
		
	}
}
