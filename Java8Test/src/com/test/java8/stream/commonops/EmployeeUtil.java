package com.test.java8.stream.commonops;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {
	private static List<Employee> employeeList;
	public static List<Employee>getEmployees(){
		employeeList = new ArrayList();
		employeeList.add(new Employee(100, "Naru", 2000000, new Address(12,"kolkata", 721431), "java"));
		employeeList.add(new Employee(102, "Haru", 20000, new Address(12,"kolkata", 721431), "java"));
		employeeList.add(new Employee(103, "Peru", 200000, new Address(12,"kolkata", 721431), "java"));
		employeeList.add(new Employee(105, "Mrinal", 4000000, new Address(12,"pune", 721431), "python"));
		employeeList.add(new Employee(104, "Animesh", 5000000, new Address(12,"pune", 721431), "python"));
		employeeList.add(new Employee(106, "Shib", 400000, new Address(12,"pune", 721431), "admin"));
		employeeList.add(new Employee(107, "Prakash", 3000000, new Address(12,"patna", 721431), "nodejs"));
		employeeList.add(new Employee(108, "Anima", 500000, new Address(12,"patna", 721431), "nodejs"));
		employeeList.add(new Employee(109, "Srijita", 6000000, new Address(12,"patna", 721431), "nodejs"));
		employeeList.add(new Employee(110, "Epsita", 9000000, new Address(12,"patna", 721431), "mongodb"));
		employeeList.add(new Employee(120, "Shib", 500000, new Address(12,"Delhi", 721431), "pm"));
		employeeList.add(new Employee(111, "Shit", 900000, new Address(12,"Delhi", 721431), "mongodb"));
		employeeList.add(new Employee(112, "Shir", 700000, new Address(12,"Delhi", 721431), "php"));
		employeeList.add(new Employee(113, "Shib", 800000, new Address(12,"Delhi", 721431), "php"));
		employeeList.add(new Employee(114, "Shib", 600000, new Address(12,"Mumbai", 721431), "php"));
		employeeList.add(new Employee(115, "Sathi", 600000, new Address(12,"Mumbai", 721431), "hr"));
		return employeeList;
	}

}
