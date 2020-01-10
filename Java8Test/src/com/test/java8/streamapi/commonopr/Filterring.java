package com.test.java8.streamapi.commonopr;

import java.util.List;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class Filterring {

	public static void main(String[] args) {
		Filterring filter = new Filterring();
		filter.testFiltering();
	}

	private void testFiltering() {
		List<Employee> listEmployee = EmployeeUtil.getEmployees();
		listEmployee.stream()
		.filter(e->e.getEmpName().startsWith("Sh"))
		.filter(e1->e1.getSalary()>600000)
		.forEach(System.out::println);
		
	}

}
