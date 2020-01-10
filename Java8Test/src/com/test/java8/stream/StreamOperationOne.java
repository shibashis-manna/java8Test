package com.test.java8.stream;

import java.util.List;

public class StreamOperationOne {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDAO.getEmployees();
		//operation-1, Traditional way
		
		/*for (Employee employee : employeeList) {
			System.out.println(employee.toString());
		}*/
		
		//System.out.println("\n\n java-8 lamda expression......\n\n");
		//employeeList.stream().forEach((t) -> System.out.println(t));
		
		// print employee whose salary less thenk 5 lacs start with A
		
		employeeList.stream().filter((t)->t.getSalary()<500000).forEach((t)->System.out.println(t));

	}

}
