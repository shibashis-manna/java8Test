package com.test.java8.lamda;

import java.util.Arrays;
import java.util.List;

public class Lamda6 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,3,6,4,2,7,8);
		
		// find the double value of even number which is just next value of 3
		
		/*int result = 0;
		for (int i : numbers) {
			if(i>3 && i%2 == 0) {
				System.out.println(i*2);
				break;
			}
		}*/
		
		System.out.println(
				numbers.stream()
						.filter(e -> e>3)
						.filter(e -> e%2==0)
						.map(e -> e*2)
						.findFirst()
				);

	}

}
