package com.isaachome;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.add("F");
		ll.add(2, " Changed");
		System.out.println("Original Content : " + ll);
		ll.remove("F");
		System.out.println("Contents after deleting: " + ll);
//		remove first and last elements
		ll.removeLast();
		ll.removeFirst();
		
		String value = ll.get(2);
		ll.set(2, value + " updated");
		System.out.println("After Updating : " + ll);
	}
}
