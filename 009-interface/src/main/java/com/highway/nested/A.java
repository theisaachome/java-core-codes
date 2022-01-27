package com.highway.nested;

public class A {

	public interface NestedInterface{
		boolean isValid(int x);
	}
}

class B implements A.NestedInterface{

	@Override
	public boolean isValid(int x) {
		if(x>0)return true;
		return false;
	}
	
}