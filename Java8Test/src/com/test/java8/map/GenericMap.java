package com.test.java8.map;

import java.util.HashMap;
import java.util.Map;

public class GenericMap {

	public static void main(String[] args) {
		Map <Integer, Object> map = new HashMap<>();
		map.put(1, new Employee("Ram", 20, "six"));
		map.put(2, new String("Hello World"));
		map.put(3, "this is wrong");
		map.put(4, 6);
		
		map.forEach(System.out::println);

	}

}
