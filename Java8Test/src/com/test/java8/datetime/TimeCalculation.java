package com.test.java8.datetime;

import java.time.Duration;
import java.time.Instant;

public class TimeCalculation {

	public static void main(String[] args) throws InterruptedException {
		int i = 10;
		Instant start = Instant.now();
		//Integer[] myIntArray = Math.random();
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		Duration d = Duration.between(start, end);
		System.out.printf("%s %d %s", "Aggarigatting time took", d.toMillis(), "ms for sequential execution");

	}

}
