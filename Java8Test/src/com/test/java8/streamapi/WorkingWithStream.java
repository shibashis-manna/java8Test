package com.test.java8.streamapi;

import java.util.List;

public class WorkingWithStream {

	
	
	
	public static void main(String[] args) {
		
		WorkingWithStream wws = new WorkingWithStream();
		wws.findEmployee(EmployeeUtil.getEmployees());
		

	}

	private void findEmployee(List<Employee> list) {
		// find list of employee with filter
	/*	list.stream()
			.filter((emp) -> emp.getEmpName().startsWith("Sh")?true:false)
			.filter(e->e.getSalary()>600000?true:false)			
			//.map(Employee::getEmpName)
			.map(Employee::getSalary)
			.limit(4)
			
			.forEach(System.out::println);*/
		
		
		// find list of employee with filter
				list.stream()
					.filter(emp -> emp.getEmpName().startsWith("Sh")?true:false)
					.filter(e->e.getSalary()>600000?true:false)
					//.flatMap(p -> Stream.of(p.getEmpName(),p.getSalary()))									
					.limit(4)					
					.forEach(System.out::println);
	
		
	}

}
