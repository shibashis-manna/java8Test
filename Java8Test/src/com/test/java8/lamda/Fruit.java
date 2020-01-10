package com.test.java8.lamda;

 public class Fruit {
	 public static void juice (){
	  System.out.println("Fruit juice");
	 }
	 public static void main (String args []) {
		  Fruit fruit = new Fruit();
		  Fruit apple = new Apple();
		  fruit.juice();
		  apple.juice();
		 }
	}
	class Apple extends Fruit {
	 public static void juice (){
	  System.out.println("Apple juice");
	 }
	
	}


