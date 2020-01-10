package com.test.java8.stream.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortMapByEmployee {

	public static void main(String[] args) {
	
		
		//************************ Traditional way *********************************//
		/*Map<Employee, Integer> empMap = new TreeMap<Employee, Integer>(new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {				
				return (int)(emp1.getSalary() - emp2.getSalary());
			}
		});
		empMap.put(new Employee(100, "Raja", 10000), 10);
		empMap.put(new Employee(106, "Haja", 30000), 10);
		empMap.put(new Employee(107, "Aaja", 20000), 10);
		empMap.put(new Employee(104, "Gaja", 60000), 10);
		empMap.put(new Employee(112, "Taja", 40000), 10);
		empMap.put(new Employee(101, "Maja", 70000), 10);
		
		//System.out.println(empMap);
		List<Entry<Employee, Integer>> entryList = new ArrayList<>(empMap.entrySet());
		
		for (Entry<Employee, Integer> entry : entryList) {
			System.out.println(entry.getKey().getSalary());
			
		}*/
		
		/********************* with Lamda Expression **********************************/
		
		/*Map<Employee, Integer> empMap = new TreeMap<Employee, Integer>((emp1, emp2) ->(int)(emp1.getSalary() - emp2.getSalary()));
		empMap.put(new Employee(100, "Raja", 10000), 10);
		empMap.put(new Employee(106, "Haja", 30000), 10);
		empMap.put(new Employee(107, "Aaja", 90000), 10);
		empMap.put(new Employee(104, "Gaja", 60000), 10);
		empMap.put(new Employee(112, "Taja", 40000), 10);
		empMap.put(new Employee(101, "Maja", 70000), 10);
		
		//System.out.println(empMap);
		List<Entry<Employee, Integer>> entryList = new ArrayList<>(empMap.entrySet());		
		for (Entry<Employee, Integer> entry : entryList) {
			System.out.println(entry.getKey().getSalary());
			
		}*/
		
		/********************* with stream api java8 Expression **********************************/
		Map<Employee, Integer> empMap = new HashMap<Employee, Integer>();
		empMap.put(new Employee(100, "Raja", 10000), 10);
		empMap.put(new Employee(106, "Haja", 30000), 10);
		empMap.put(new Employee(107, "Aaja", 90000), 10);
		empMap.put(new Employee(104, "Gaja", 60000), 10);
		empMap.put(new Employee(112, "Taja", 40000), 10);
		empMap.put(new Employee(101, "Maja", 70000), 10);
		
		empMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
			.forEach(System.out::println);
		System.out.println("\n--------------- Reversed -----------------\n");
		
		empMap.entrySet().stream()
			.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
			.forEach(System.out::println);
		
		System.out.println("\n --------------- Collect result with LinkedHashMap because its maintain insertion orber ----------\n");
		
		
		Map<Employee, Integer> sortedEmpMap = empMap.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) ->e1, LinkedHashMap::new));
		
		System.out.println(sortedEmpMap);
		
		
	}

}
