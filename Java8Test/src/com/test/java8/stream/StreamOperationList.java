package com.test.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamOperationList {

	public static void main(String[] args) {
		// find the list of taxable employees based on user input.
		List<Employee> empList = EmployeeDAO.getEmployees();
		List<Employee>taxEmpList = findTaxebleEmployee(empList, "tax");
		System.out.println(taxEmpList);

	}

	private static List<Employee> findTaxebleEmployee(List<Employee> empList, String tax) {
		List<Employee> taxEmpList =(tax.equalsIgnoreCase("tax"))
				?empList.stream().filter(emp ->emp.getSalary()>500000).collect(Collectors.toList())
				:empList.stream().filter(emp ->emp.getSalary()<=500000).collect(Collectors.toList());
		return taxEmpList;
	}

}
