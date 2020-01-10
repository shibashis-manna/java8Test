package com.test.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import javax.xml.ws.Provider;

/*public class PredicateDemo implements Predicate<Integer> {

	//Traditional approch
	public static void main(String[] args) {
		PredicateDemo predicateDemo = new PredicateDemo();
		
		System.out.println(predicateDemo.test(5));
	}

	@Override
	public boolean test(Integer t) {
		if(t%2==0) return true;
		else
		return false;
	}

}*/

public class PredicateDemo {

	//Lamda expression
	public static void main(String[] args) {
		/*Predicate<Integer> predicate = 
				(t) -> {
			if(t%2==0) return true;
			else
			return false;
		};*/
		
		/*Predicate<Integer> predicate = (t) -> t%2==0;		
		System.out.println(predicate.test(6));*/
		
		List<Integer> numberList = Arrays.asList(1,3,4,5,7,9,8,6,12);
		Predicate<Integer> predicate = (t) -> t%2 == 0;
		numberList.stream().filter(predicate).forEach((t) ->System.out.println("Event number: "+t));
	}

	
	

}
