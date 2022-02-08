package com.highway;

public class NestedDemo {
	public static void doMath(int ...args) {
		int a =args.length;
		System.out.println(args.length);
		try {
			int result = 100/a;
			System.out.printf("Result : %d \n a : %d\n",result,a);
			try {
				if(a==1) a=a/(a-a);
				
				if(a==2) {
					int []inum = {1,2};
					inum[20]=100;
					
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Array-index-out-of-bound"+e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero : " +e);
		}
	}

	public static void main(String[] args) {
		doMath(2,2,3);
		
		try {
			try {
				
			}catch(ArrayIndexOutOfBoundsException e) {
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
