package com.test.java8.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Ram", 12, "5th");
		Student student2 = new Student("Sam", 11, "4th");
		Student student3 = new Student("Avinandan", 14, "8th");
		Student student4 = new Student("Rami", 12, "6th");
		Student student5 = new Student("Balaram", 18, "14th");
		
		
		
		Set<Student> StudentSet = new TreeSet<Student>();
		StudentSet.add(student1);
		StudentSet.add(student3);
		StudentSet.add(student4);
		StudentSet.add(student2);
		StudentSet.add(student5);
		
		
		for (Student student : StudentSet) {
			System.out.println(student.toString());
			
		}
		
		System.out.println("\n\n  ======================  \n\n");
		
		Employee employee1 = new Employee("Ram", 12, "5th");
		Employee employee2 = new Employee("Sam", 11, "4th");
		Employee employee3 = new Employee("Avinandan", 14, "8th");
		Employee employee4 = new Employee("Rami", 12, "6th");
		Employee employee5 = new Employee("Balaram", 18, "14th");
		
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(employee1);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee2);
		employeeList.add(employee5);
		
		Collections.sort(employeeList, new SortNameEmployee());
		
		for (Employee employee : employeeList) {
			System.out.println(employee.toString());
			
		}
		
		//3rd way
		SortMainClass sortMainClass = new SortMainClass();
		List<Employee> empSortList = sortMainClass.sortByNameReverse(employeeList);
		System.out.println("----- After reverser -------");
		System.out.println(empSortList);
		
		//4th way sort by age.
		System.out.println("After sorting by age....");
		/*Collections.sort(employeeList, Comparator.comparing(Employee::getSage)
			    .thenComparingInt(Employee::getSage));*/
		
		Collections.sort(employeeList, (e1,e2) -> e2.getSage() - e1.getSage());
		System.out.println(employeeList);

	}

	private List<Employee> sortByNameReverse(List<Employee> employeeList) {
		Collections.sort(employeeList, (e1, e2) -> e2.getSname().compareTo(e1.getSname()));
		return employeeList;
	}

}
