package com.isaachome;


class Outer{
	 int outer_x=100;
	
	void  showInfo() {
		Inner inObj  = new Inner();
		inObj.display();
	}
	
	class Inner{
		int y=100;
		void display() {
			System.out.println("Outer's outer_x : " + outer_x);
		}
	}
	void showInnerVariable() {
		System.out.println("Trying to access the inner instannce variable..");
//		System.out.println("Inner variable Y : " + y);
	}
	
}
public class InnerClassDemo {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.showInfo();
		outer.showInnerVariable();
	}

}
