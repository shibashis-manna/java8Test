package com.test.java8.thread;

import java.util.concurrent.ThreadLocalRandom;

public class SingleThreadDemo {

	public static void main(String[] args) {
		
		long start_time = System.nanoTime();		
		int []dataSet = new int[1024*1024*256];
		
		for(int i = 0; i<dataSet.length; i++) {
			dataSet[i] = ThreadLocalRandom.current().nextInt();
		}
		
		int max = Integer.MAX_VALUE;
		for(int value : dataSet) {
			if(value>max) {
				max = value;
			}
		}		
		System.out.println("Max value found : " +max);
		long end_time = System.nanoTime();
		double difference = (end_time - start_time) / 1e9;
		System.out.println("Total time taken in second : " +difference);
	}

}
