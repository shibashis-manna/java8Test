package com.test.java8.stream.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListEmployee {

	public static void main(String[] args) {
		List<Employee> employeeList = Database.getEmployees();
		
		//Traditional way sort employee by salary.
		Collections.sort(employeeList, new SalaryComparator());
		System.out.println(employeeList);
		
		// Sort employee by id 2nd way.
		
		Collections.sort(employeeList, new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {				
				return o1.getId()-o2.getId();
			}			
		});
		
		System.out.println("\n 2nd way :: \n"+employeeList);
		
		//java 8 way lamda expressions.
		System.out.println("java8 way ....");
		employeeList.stream().sorted((o1,o2) -> (int)(o1.getSalary() - o2.getSalary())).forEach(System.out::print);
		System.out.println("\n");
		employeeList.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(System.out::print);
		System.out.println("\n");
		employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::print);
	}
}

class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return (int) (o1.getSalary()-o2.getSalary());
	}
	
}
