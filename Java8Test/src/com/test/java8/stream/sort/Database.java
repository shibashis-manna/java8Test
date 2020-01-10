package com.test.java8.stream.sort;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static List<Employee> employeeList;
	public static List<Employee>getEmployees(){
		employeeList = new ArrayList();
		employeeList.add(new Employee(100, "Naru", 30000));
		employeeList.add(new Employee(102, "Haru", 20000));
		employeeList.add(new Employee(103, "Peru", 70000));
		employeeList.add(new Employee(105, "Mrinal", 40000));
		employeeList.add(new Employee(104, "Animesh", 50000));
		employeeList.add(new Employee(106, "Shib", 80000));
		employeeList.add(new Employee(107, "Prakash", 90000));
		employeeList.add(new Employee(108, "Anima", 10000));
		employeeList.add(new Employee(109, "Srijita", 60000));
		employeeList.add(new Employee(110, "Epsita", 100000));
		return employeeList;
	}

}
