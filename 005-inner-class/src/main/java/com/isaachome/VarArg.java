package com.isaachome;

public class VarArg {
	public static void call(int ...v) {
		for (int i : v) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		call(1,2,3,4);
		call();
	}

}
