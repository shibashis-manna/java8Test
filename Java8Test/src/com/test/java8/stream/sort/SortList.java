package com.test.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> myNumberList = new ArrayList<Integer>();
		myNumberList.add(3);
		myNumberList.add(2);
		myNumberList.add(1);
		myNumberList.add(5);
		myNumberList.add(8);
		myNumberList.add(7);
		myNumberList.add(6);
		
		//Traditional way
		Collections.sort(myNumberList);
		System.out.println(myNumberList);
		
		Collections.reverse(myNumberList);
		System.out.println(myNumberList);
		
		//using java8
		
		myNumberList.stream().sorted().forEach(n->System.out.println(n));//accending order
		myNumberList.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));//reverse order
		
	}

}
