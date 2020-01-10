package com.test.java8.lamda;

import java.util.Arrays;
import java.util.List;

public class Lamda5 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,6,4,2,7,8);
		
		// find the sum of double values.
		/*int result = 0;
		for(int e : numbers){
			result +=e*2;			
		}
		System.out.println("total: " +result);*/
		
		System.out.println(
				numbers.stream()
						.map(e->e*2)
						.reduce(0, (c, e)->c+e)
				);

	}

}
