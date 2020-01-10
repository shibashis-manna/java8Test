package com.test.java8.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

// sort by minium summer rating
public class BishnuPOC1 {

	public static void main(String[] args) {
		List<Transformar> transformarList = new ArrayList();
		transformarList.add(new Transformar("T1", 10, 20, "sumer1", "winter1", "other10"));
		transformarList.add(new Transformar("T1", 20, 30, "sumer1", "winter1", "other20"));
		
		transformarList.add(new Transformar("T2", 200, 10, "sumer1", "winter1", "otherxyz10"));
		transformarList.add(new Transformar("T2", 200, 20, "sumer1", "winter1", "otherxyz20"));
		transformarList.add(new Transformar("T2", 20, 30, "sumer1", "winter1", "otherxyz30"));
		
		transformarList.add(new Transformar("T3", 30, 30, "sumer1", "winter1", "otherxyz10"));
		transformarList.add(new Transformar("T3", 300, 40, "sumer1", "winter1", "otherxyz20"));
		transformarList.add(new Transformar("T3", 20, 50, "sumer1", "winter1", "otherxyz30"));
		
		transformarList.add(new Transformar("T4", 40, 30, "sumer1", "winter1", "otherxyz10"));
		transformarList.add(new Transformar("T4", 400, 40, "sumer1", "winter1", "otherxyz20"));
		transformarList.add(new Transformar("T4", 40, 50, "sumer1", "winter1", "otherxyz30"));
		transformarList.add(new Transformar("T4", 30, 60, "sumer1", "winter1", "otherxyz40"));
		
		/*Map<String, List<Transformar>> filterByMinimumSummerRattingList = transformarList.stream()				
							.collect(Collectors.groupingBy(Transformar::getTid));
		
		System.out.println(filterByMinimumSummerRattingList);*/
		
		Map<String, Transformar> filterByMinimumSummerRattingList = transformarList.stream()
					.collect(Collectors.toMap(Transformar::getTid, Function.identity(),
							BinaryOperator.minBy(Comparator.comparing(Transformar::getSummerRating))));
		
		System.out.println(filterByMinimumSummerRattingList);
	}

}
