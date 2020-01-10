package com.test.java8.stream.commonops;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
	List<Employee> employees = EmployeeUtil.getEmployees();

	public static void main(String[] args) {
		Grouping groping = new Grouping();
		groping.groupingByName();
		groping.groupingByDepartment();
		groping.groupingBySalaryCity();
		groping.groupingByList();
		groping.groupingByCount();

	}
	public void groupingByName() {
		Map<String, List<Employee>> cityEmployee = employees.stream()
										.collect(Collectors.groupingBy(Employee::getEmpName));
		System.out.println(cityEmployee);
		
	}
	
	public void groupingByDepartment() {
		Map<String, List<Employee>> depEmployee = employees.stream()
				.collect(Collectors.groupingBy(e->e.getDepartment()));
			System.out.println(depEmployee);
		
	}
	
	public void groupingBySalaryCity() {
		Map<String, Map<String, List<Employee>>> employeegroupBysalaryCity = employees.stream()
				.collect(
						groupingBy(Employee::getEmpName, 
								groupingBy(Employee::getSalary)
						)
				);
	}
	
	public void groupingByList() {
		
	}
	
	public void groupingByCount() {
		
	}

}
