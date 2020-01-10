package com.test.java8.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Lamda4 {

	public static void main(String[] args) {
		
		List<Integer> alist = Arrays.asList(1,9,4,7,3,5,6);
		System.out.println(alist);
		
		// find the double of first even number
		//one way
		/*int k = 0;
		for(int i=0; i<alist.size(); i++){			
			int j = alist.get(i);
			k = j;
			System.out.println(j);
			if(j>0 && j%2==0){
				k = k*2;
				break;
			}			
		}
		System.out.println("double value: "+ k);*/
		
		// 2nd way
		/*for(int i : alist){
			//System.out.println(i);
			if(i>0 && i%2==0){
				System.out.println(i*2);
				break;
			}
		}*/
		
		//3rd way
		/*alist.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);				
			}			
		} );*/
		
		//4th way
		/*alist.forEach(
				(Integer value)->System.out.println(value));*/
		
		//5th way
			/*	alist.forEach(
						(value)->System.out.println(value));*/
				
		//6th way
		/*alist.forEach(value->System.out.println(value));*/
		
		//7th way
		alist.forEach(System.out::println);

	}
	
	interface Lamda4I {
		void method1();
	}

}
