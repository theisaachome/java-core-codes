package com.highway.reference;
class A{
    A(){
        System.out.println("In A constructor");
    }
    protected void show() {
    	System.out.println("A show method.");
    }
}
class B extends A{
    B(){
        System.out.println("In B constructor");
    }
    public void show() {
    	System.out.println("B show method.");
    }
}
class C extends B{
    C(){
        System.out.println("In C constructor");
    }
}
public class SuperDemo {
	public static void main(String[] args) {
		var obj = new C();
		obj.show();
	}
}
