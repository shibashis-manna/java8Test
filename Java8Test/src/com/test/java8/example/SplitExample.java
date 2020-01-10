package com.test.java8.example;

import java.util.Arrays;
import java.util.List;

public class SplitExample {

	public static void main(String[] args) {
		int array[] = { 0, 1, 2, 3, 4 };
		int key = 3;
		int pos = 0;
		for (pos = 0; pos < array.length; ++pos) {
			if (array[pos] == key) {
				break;
			}
			System.out.println("Found " + key + " at " + pos);
		}
		

		/*
		 * String textData = "12"; String[] dataArray = textData.split(",");
		 * System.out.println(dataArray.length);
		 * Arrays.asList(dataArray).stream().forEach(System.out::println);
		 */

	}

}
