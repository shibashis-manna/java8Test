package com.test.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		//Traditional way
		Map<String, String> intMap = new HashMap<String, String>();
		intMap.put("Cwo", "Shib");
		intMap.put("Bne", "Ram");
		intMap.put("Four", "Amit");
		intMap.put("Dhree", "Rana");
		intMap.put("Eive", "Sham");
		intMap.put("Aix", "Babul");
		
		
		//************** Traditional way *************************//
		/*Set<Entry<String, String>> mapEntrySet = intMap.entrySet();
		for (Entry<String, String> entry : mapEntrySet) {
			System.out.println(entry.getKey() +" --- >"+entry.getValue());
		}
		
		// write own comparator
		Comparator valueComparator = new Comparator<Entry<String,String>>() {
			@Override
			public int compare(Entry<String,String> o1, Entry<String,String> o2) {				
				return o1.getKey().compareTo(o2.getKey());
			}			
		};
		List<Entry<String, String>> listEntries = new ArrayList<Entry<String, String>>(mapEntrySet);
		
		// sorting by key. traditional approch.
		Collections.sort(listEntries, valueComparator);
		System.out.println(listEntries);*/
		
		//************** using lamda expression *************************//
		
		/*Set<Entry<String, String>> mapEntrySet = intMap.entrySet();
		List<Entry<String, String>> listEntries = new ArrayList<Entry<String, String>>(mapEntrySet);
		Collections.sort(listEntries, (o1, o2) ->o1.getKey().compareTo(o2.getKey()));
		System.out.println(listEntries);*/
		
		//************** java8  approch expression *************************//
		intMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("************ sort by value ***********");
		intMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("******** Revarse order *************************");
		
		//intMap.entrySet().stream().sorted(Map.Entry.comparingByKey().reversed()));
		//intMap.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).forEach(System.out::println);
		
		
	}
}
