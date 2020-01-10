package com.test.java8.streamapi;

import java.util.Arrays;
import java.util.List;

public class CountEventNumber {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,5,4,6,12,15,26,18,23);
		
		// inprative way
		
		int count = 0;
		for(int i : numbers){
			if(i%2==0)
				count++;
			
		}
		System.out.println(count);
		
		//declarative way with lamda expression
		long count1 = numbers
					.stream()
					.filter(n ->n%2 == 0)
					.count();
		System.out.println(count1);

	}

}
