package com.test.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class SumOfEventNumber {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2,3,6,7,9,4,12,25,23,5,18);
		
		//imperative way
		
		int sum = 0;
		for(int n : numbers) {
			if(n%2 == 0)
				sum = sum+n;
		}
		System.out.println(sum);
		
		//declarative way
		 
		int sum1 = numbers
					.stream()
					.filter(n->n%2==0)
					.mapToInt(Integer::intValue)
					.sum();
		System.out.println("Declarative sum :" +sum1);
		
		
		// alternative way
		
		int sum2 = numbers
					.stream()
					.filter(n -> n%2==0)
					.reduce(0, (c, n)->c+n);
		System.out.println(sum2);
		
		

	}

}
