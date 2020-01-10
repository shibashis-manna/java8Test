package com.test.java8.streamapi;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
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
		employeeList.add(new Employee(120, "Shib", 500000));
		employeeList.add(new Employee(111, "Shit", 900000));
		employeeList.add(new Employee(112, "Shir", 700000));
		employeeList.add(new Employee(113, "Shib", 800000));
		employeeList.add(new Employee(114, "Shib", 600000));
		employeeList.add(new Employee(115, "Sathi", 600000));
		return employeeList;
	}

}
