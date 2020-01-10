package com.test.java8.lamda;

public class Lamda3 {

	public static void main(String[] args) {
		
		Lamda3I lamda3I = ()->System.out.println("Lamda expression call...");
		lamda3I.method1();
	}
	
	interface Lamda3I {
		public void method1();
	}

}
