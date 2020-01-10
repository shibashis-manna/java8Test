package com.test.java8.functional;

import java.util.function.Predicate;

public class PredicateEmployee {

	public static void main(String[] args) {
		// find the employee is senior executive or not.
		
		Predicate<Employee> pe = (ename) -> ename.getSname().startsWith("SE")?true:false;
		Employee e1 = new Employee("SERatan", 20, "special");
		Employee e2 = new Employee("SERaman", 28, "tribal");
		Employee e3 = new Employee("SARangan", 30, "Officerl");
		
		System.out.println(pe.test(e1));
		System.out.println(pe.test(e2));
		System.out.println(pe.test(e3));
		

	}

}
