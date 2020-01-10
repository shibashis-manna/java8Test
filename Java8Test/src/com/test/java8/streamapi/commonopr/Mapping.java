package com.test.java8.streamapi.commonopr;

import java.util.List;
import java.util.stream.Stream;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class Mapping {

	public static void main(String[] args) {
		Mapping mapping = new Mapping();
		mapping.testMaping();

	}

	private void testMaping() {
		List<Employee> listEmployee = EmployeeUtil.getEmployees();
		Stream<String> empNameStream = listEmployee.stream()
									.map(Employee::getEmpName)
									.map(String::toUpperCase)
									.distinct();
		empNameStream.forEach(System.out::println);
									
		
	}

}
