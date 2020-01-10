package com.test.java8.inheritance;

public class InharitanceBehaviour {

	// interface behavour from multiple interface
	
	interface Engine {
		default String make() {
			return "DEFAULT MAKE";
		}
	}
	
	interface Vehicle {
		default String model() {
			return " DEFAULT MODEL";
		}
	}
	
	class Car implements Engine, Vehicle{

		//java 8 way
		String makeAndModel() {
			return Engine.super.make() +
					Vehicle.super.model();
		}
		
	}
	
	public static void main(String[] args) {
		InharitanceBehaviour ib = new InharitanceBehaviour();
		InharitanceBehaviour.Car c = ib.new Car();
		System.out.println(c.makeAndModel());
	}

}
