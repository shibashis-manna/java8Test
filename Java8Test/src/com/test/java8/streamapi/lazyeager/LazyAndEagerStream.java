package com.test.java8.streamapi.lazyeager;

import java.util.List;
import java.util.stream.Stream;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class LazyAndEagerStream {
	List<Employee> listEmployee = EmployeeUtil.getEmployees();

	public static void main(String[] args) {
		LazyAndEagerStream las = new LazyAndEagerStream();
		las.lezyTest();
		las.eagerTest();
		
	}

	private void eagerTest() {
		System.out.println("---------------- eager test ---------------");
		List<Employee> listEmployee = EmployeeUtil.getEmployees();
		Stream<Employee> employeeStream = listEmployee.stream()
			.filter(emp -> {
				System.out.println("filter call...");
				return emp.getEmpName().startsWith("Sh")?true:false;
			}).map(m -> {
				System.out.println("mapper call");
				return m;	
			});
		
	System.out.println(employeeStream.count());
		
	}
	
	

	private void lezyTest() {
		System.out.println("---------------lazy test ---------------");
		List<Employee> listEmployee = EmployeeUtil.getEmployees();
		listEmployee.stream()
			.filter(emp -> {
				System.out.println("filter call...");
				return emp.getEmpName().startsWith("Sh")?true:false;
			});
		
	}

}
