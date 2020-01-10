package com.test.java8.streamapi.commonopr;

import java.util.List;

import com.test.java8.streamapi.Employee;
import com.test.java8.streamapi.EmployeeUtil;

public class Reducing {
	//use reduce method
	List<Employee> listEmployee = EmployeeUtil.getEmployees();

	public static void main(String[] args) {
		new Reducing().employeeListWithcomma();
		new Reducing().totalEmployeeSalary();
		new Reducing().totalSalaryWithInnitialValue();

	}

	private void totalSalaryWithInnitialValue() {
		// TODO Auto-generated method stub
		
	}

	private void totalEmployeeSalary() {
		// TODO Auto-generated method stub
		
	}

	private void employeeListWithcomma() {
		// TODO Auto-generated method stub
		
	}

}
