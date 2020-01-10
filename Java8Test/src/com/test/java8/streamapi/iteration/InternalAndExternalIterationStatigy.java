package com.test.java8.streamapi.iteration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class InternalAndExternalIterationStatigy {
	
	
	
	private void testExternalIteration1() {		
		System.out.println("1. Find the top tow highest salary employees whose name start with 'Sh' " );
		List<Employee> listEmployee = EmployeeUtil.getEmployees();
		List<Employee> filterEmployee = new ArrayList<>();
		for(Employee e : listEmployee) {
			if(e.getEmpName().startsWith("Sh")) {
				filterEmployee.add(e);
			}
		}
		//System.out.println(filterEmployee);
		
		filterEmployee.sort(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSalary()-o1.getSalary());
			}
		});
		
		System.out.println(filterEmployee.subList(0, 2));
		
	}
	
	private void testInternalIteration1() {
		System.out.println("2. Find the top tow highest salary employees whose name start with 'Sh' " );
		List<Employee> listEmployee = EmployeeUtil.getEmployees();		
		listEmployee.stream()
		.filter(e->e.getEmpName().startsWith("Sh"))
		.sorted((e1,e2) -> (int)(e2.getSalary()-e1.getSalary()))
		.limit(2)
		.forEach(System.out::println);			
	}
	
	
	

	private void testInternalIteration3() {
		// TODO Auto-generated method stub
		
	}

	private void testExternalIteration3() {
		// TODO Auto-generated method stub
		
	}

	private void testInternalIteration2() {
		// TODO Auto-generated method stub
		
	}

	private void testExternalIteration2() {
		// TODO Auto-generated method stub
		
	}

	

	
	
public static void main(String[] args) {
		
		InternalAndExternalIterationStatigy iei = new InternalAndExternalIterationStatigy();
		iei.testExternalIteration1();
		iei.testInternalIteration1();
		
		iei.testExternalIteration2();
		iei.testInternalIteration2();
		
		iei.testExternalIteration3();
		iei.testInternalIteration3();

	}

}
