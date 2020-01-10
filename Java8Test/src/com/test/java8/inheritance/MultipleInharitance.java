package com.test.java8.inheritance;

public class MultipleInharitance {
	
	//Multiple inharitance
	// Resouve dimond problem, means its access same method of both interface with using crtein rule
	//Rule-1: Always first class access
	//Rule-2: Subinterface call 2nd
	//Rule-3: super access 3rd
	
	interface Engine {
		default String make() {
			return "Default Engine make";
		}		
	}
	
	//************************** First rule class first ******************************//
	
	/*interface Vehicle {
		default String make() {
			return "default Vehicle make";
		}
	}
	
	
	class Car implements Engine, Vehicle {
		
		public String make() {
			return "Anything";
		}
	}*/
	
	//**************************** 2nd rule inharitance 2nd ***************************//
	
	
	interface Vehicle extends Engine{
		default String make() {
			return "default Vehicle make";
		}
	}
	
	
	class Car implements Engine, Vehicle {
		MultipleInharitance mh = new MultipleInharitance();
		MultipleInharitance.Car mc = mh.new Car();
		String s = mh.new Car().make();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
