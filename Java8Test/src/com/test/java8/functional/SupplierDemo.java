package com.test.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;


/*//Traditional Approch
public class SupplierDemo implements Supplier<String>{
	
	public static void main(String[] args) {
		SupplierDemo supplierDemo = new SupplierDemo();
		System.out.println(supplierDemo.get());
		
	}

	@Override
	public String get() {		
		return "Hello World";
	}

}*/

//Lamda expression
public class SupplierDemo{
	
	public static void main(String[] args) {
		/*
		Supplier<String> supplier = () -> {
			return "Hello World";
		};
		System.out.println(supplier.get());*/
		

		Supplier<String> supplier = () -> {
			return "Hello World";
		};
		List<String> aList = Arrays.asList("One", "two", "A");
		System.out.println(aList.stream().findAny().orElseGet(supplier));
	}

}
