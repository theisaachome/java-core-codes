package com.highway.override;

class Parent{
	int i;
	void show() {
		System.out.println("Parent Show method");
	}
}
class Child extends Parent{
	int j;
	void show() {
		System.out.println("Child Show Method");
	}
}
class GrandChild extends Parent{
	int k;
	void show() {
		System.out.println("GrandChild show Method");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		Parent papaObj ;
		Parent parent =new Parent();
		Child child = new Child();
		GrandChild grandChild = new GrandChild();
		parent.show();
		child.show();
		grandChild.show();
		
		papaObj= child;
		papaObj.show();
	}
}
