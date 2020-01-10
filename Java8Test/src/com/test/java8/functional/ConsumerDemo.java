package com.test.java8.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

// Traditional Approch
/*public class ConsumerDemo implements Consumer<Integer>{

	public static void main(String[] args){
		Consumer<Integer> consumer = new ConsumerDemo();
		consumer.accept(10);		
	}
	@Override
	public void accept(Integer t) {
		System.out.println("Print variable : "+t);
		
	}

}*/
public class ConsumerDemo{

	/*public static void main(String[] args){
		//Lamda expression
		Consumer<Integer> consumer = (t) -> {
			System.out.println("Print variable : "+t);			
		};
		consumer.accept(10);		
	}*/
	
	public static void main(String[] args){
		List<Integer> numberList = Arrays.asList(10,2,4,3,6,5,8);
		
		
		Consumer<Integer> consumer = (t) -> {
			System.out.println("Print variable : "+t);			
		};
		numberList.forEach(consumer);
		
		//Optional optional = numberList.stream().findAny();
		//System.out.println(optional);
	}
	

}
