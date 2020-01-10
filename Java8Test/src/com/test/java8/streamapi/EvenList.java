package com.test.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class EvenList {

	public static void main(String[] args) {		
		
		List<Integer> numbers = Arrays.asList(1,2,4,6,5,7,9,12,24,14,17,19);
		//imprative way
		List<Integer> eventList = new ArrayList<Integer>();
		
		for(int a : numbers) {
			if(a%2 == 0) {
				eventList.add(a);
			}
		}
		System.out.println("Event list :"+eventList);
		
		
		//declarative way
		
		List<Integer> eventList1 = numbers
									.stream()
									.filter( n-> n%2 == 0)
									.collect(Collectors.toList());
		
		System.out.println("Declarative list :"+eventList1);
		
		// another way
		numbers.stream().filter(n -> n%2==0).forEach(System.out::println);
		
		//another way
		System.out.println("Consumer way process \n\n");
		numbers.stream().filter(n->n%2==0).forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				System.out.println("test..consumer");
			}	
		});
									

	}

}
