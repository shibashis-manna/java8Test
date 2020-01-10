package com.test.java8.streamapi.commonopr;

import java.util.List;
import java.util.stream.Stream;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class DistinceLimitSkip {
	List<Employee> listEmployee = EmployeeUtil.getEmployees();

	public static void main(String[] args) {
		DistinceLimitSkip dls = new DistinceLimitSkip();
		dls.distinctTest();
		dls.limitTest();
		dls.skipTest();
		

	}

	private void skipTest() {
		System.out.println("----------------- skip test --------------");
		Stream<String> skipStream = listEmployee.stream()
				.map(Employee::getEmpName)
				.distinct()				
				.skip(10);

		skipStream.forEach(System.out::println);
		
	}

	private void limitTest() {
		System.out.println("----------------- limit test --------------");
		Stream<String> limitStream = listEmployee.stream()
				.map(Employee::getEmpName)
				.distinct()
				.limit(3);

		limitStream.forEach(System.out::println);
		
	}

	private void distinctTest() {
		System.out.println("----------------- distinct test --------------");
		Stream<String> distinctStream = listEmployee.stream()
										.map(Employee::getEmpName)
										.distinct();
		
		distinctStream.forEach(System.out::println);
		
	}

}
