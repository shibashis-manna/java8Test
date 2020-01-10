package com.test.java8.lamda.constractref;

public class ArrayReferences {
	
	interface StringArray {
		String[] create(int size);
	}
	
	// declaration
	StringArray sa = (i) -> new String[i];
	StringArray sa1 = String[] :: new;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
