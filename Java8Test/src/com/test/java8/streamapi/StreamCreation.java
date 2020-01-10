package com.test.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreation {
	private static Employee[] employeeArray = {new Employee(1, "Ravi", 1000000), new Employee(2, "Ram", 200000),
												new Employee(7, "Ranu", 300000), new Employee(4, "stifen", 100000)};
	public static void main(String[] args) {
		//System.out.println(employeeArray[0].toString());
		//Stream creation
		Stream<Employee> employeeStream = Stream.of(employeeArray);
		
		//Stream creation 2nd way
		List<Employee> empList = Arrays.asList(employeeArray);
		Stream<Employee> employeeStream1 = empList.stream();
		
		//Stream creation 3rd way
		Stream.Builder<Employee> streamBuilder = Stream.builder();
		streamBuilder.accept(employeeArray[0]);
		streamBuilder.accept(employeeArray[1]);
		streamBuilder.accept(employeeArray[2]);
		streamBuilder.accept(employeeArray[3]);
		Stream<Employee> employeeStream2 = streamBuilder.build();
		
		
		
		

	}

}
