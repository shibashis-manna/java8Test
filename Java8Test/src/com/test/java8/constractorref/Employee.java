package com.test.java8.constractorref;

public class Employee {
	
	String name;
	Integer age;
	
	public Employee(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("This is display call....");
	}
}
