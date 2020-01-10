package com.test.java8.streamapi.commonopr;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class Collecting {
	List<Employee> listEmployee = EmployeeUtil.getEmployees();

	public static void main(String[] args) {
		new Collecting().collectingIntoList();
		new Collecting().collectingIntoSet();
		new Collecting().collectingIntoMap();
		

	}

	private void collectingIntoSet() {
		System.out.println("------------- collect set ----------------");
		Set<Employee> employeeSetStream = listEmployee.stream().collect(Collectors.toSet());
		employeeSetStream.forEach(System.out::println);
		
	}

	private void collectingIntoMap() {
		System.out.println("------------- collect Map ----------------");
		Map<Integer, Employee> employeeMapStream = listEmployee.stream()
													.collect(Collectors.toMap(Employee::getEmpId, employee->employee));
		System.out.println(employeeMapStream);
	}

	private void collectingIntoList() {
		System.out.println("------------- collect List ----------------");
		List<Employee> employeeListStream = listEmployee.stream().collect(Collectors.toList());
		employeeListStream.forEach(System.out::println);
		
	}

}
