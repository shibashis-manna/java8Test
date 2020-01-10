package com.test.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	private static List<Employee> employeeList;
	public static List<Employee>getEmployees(){
		employeeList = new ArrayList();
		employeeList.add(new Employee(100, "Naru", 2000000));
		employeeList.add(new Employee(102, "Haru", 20000));
		employeeList.add(new Employee(103, "Peru", 200000));
		employeeList.add(new Employee(105, "Mrinal", 4000000));
		employeeList.add(new Employee(104, "Animesh", 5000000));
		employeeList.add(new Employee(106, "Shib", 400000));
		employeeList.add(new Employee(107, "Prakash", 3000000));
		employeeList.add(new Employee(108, "Anima", 500000));
		employeeList.add(new Employee(109, "Srijita", 6000000));
		employeeList.add(new Employee(110, "Epsita", 9000000));
		return employeeList;
	}

}
