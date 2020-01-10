package com.test.java8.streamapi;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
	
	// from collection
	public void testCollectionStream() {
		System.out.println("----------- call 1st method ----------------");
		List<Employee> employeeList = EmployeeUtil.getEmployees();
		Stream employeeStream = employeeList.stream();
		employeeStream.forEach(System.out::println);
		
	}
	
	//empty stream
	public void testEmptyStream() {
		System.out.println("----------- call 2nd method ----------------");
		Stream<Employee> emptyEmployeeStream = Stream.empty();
		System.out.println(emptyEmployeeStream.count());
		
	}
	
	//from values/array
	
	public void testStreamFromValues() {
		System.out.println("----------- call 3rd method ----------------");
		
		Stream<String> movieName = Stream.of("Comedy", "romantic", "thrillar", "action");
		System.out.println(movieName.count());
		
		String[] movieName2 =  {"Comedy", "romantic", "thrillar"};		
		Stream<String> moveiStream = Stream.of(movieName2);
		System.out.println(moveiStream.count());
		
	}
	
	//from file
	 public void testStreamFromFile() {
		 System.out.println("----------- call 4th method ----------------");
		 ///Java8Test/src/com/test/java8/streamapi/streamTest.txt
		 try {
			Stream<String> fileLines = Files.lines(Paths.get("C:\\shib\\westernPower\\test_workspace\\Java8Test\\src\\com\\test\\java8\\streamapi\\streamTest.txt"));
			fileLines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	 }
	
	// with string builder
	 
	 public void testStreamBuilder() {
		 System.out.println("----------- call 5th method ----------------");
		 Stream.Builder<String> streamBuilder = Stream.builder();
		 streamBuilder.accept("One");
		 streamBuilder.accept("Two");
		 streamBuilder.accept("Four");
		 streamBuilder.accept("Five");
		 streamBuilder.accept("Six");
		 streamBuilder.accept("Three");
		 
		 Stream<String> builderSream = streamBuilder.build(); 
		 builderSream.forEach(System.out::println);
		 
	 }
	 
	 // generate iterate stream
	 public void testGenerateIterateStream() {
		 System.out.println("----------- call 6th method ----------------");
		 //Stream<Double> randomStream = Stream.generate(Math::random);
		 //randomStream.forEach(System.out::println);
		 
		// Stream<Integer> wholeNumber = Stream.iterate(100, i->i+10);
		 //wholeNumber.forEach(System.out::println);
	 }

	public static void main(String[] args) {
		new CreatingStream().testCollectionStream();
		new CreatingStream().testEmptyStream();
		new CreatingStream().testStreamFromValues();
		new CreatingStream().testStreamFromFile();
		new CreatingStream().testStreamBuilder();		
		new CreatingStream().testGenerateIterateStream();
		

	}

}
