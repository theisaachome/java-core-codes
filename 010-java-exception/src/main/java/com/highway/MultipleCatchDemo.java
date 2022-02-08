package com.highway;

public class MultipleCatchDemo {
	public static void main(String[] args) {
		String[] student = {"Maung Maung","Aung Aung"};
		int grade=90;
		
		try {
			double avg = grade/0;
			System.out.println(avg);
			student[10]="Kyawy Kyaw";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
