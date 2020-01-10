package com.test.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {
		// Imperative way
		System.out.println("Imperative way ..........\n");
		List<String> strList = Arrays.asList("test1", "Test6", "test3", "test4", "test5", "test7","test9");
		for(String s : strList) {
			System.out.println(s);
		}
		
		System.out.println("\n\nDeclarative way.....");
		//Declarative way -> using lamda expression
		strList.forEach(s -> System.out.println(s));
		
		System.out.println("\n\n .. method reference...");
		//using method reference
		strList.forEach(System.out::println);
		

	}

}
