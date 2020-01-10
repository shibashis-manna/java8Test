package com.test.java8.lamda;

public class Lamda2 {

	public static void main(String[] args) {
		Lamda2I lamda2I = new Lamda2I(){
			public void method1(){
				System.out.println("method1 call....");
			}
		};
		lamda2I.method1();

	}
	
	interface Lamda2I {
		public void method1();
	}

}
