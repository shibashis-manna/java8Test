package com.test.java8.stream.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortMapByValue {
	public static void main(String[] args) {
		//Traditional way
		Map<Integer, String> intMap = new TreeMap<Integer, String>();
		intMap.put(3, "Shib");
		intMap.put(4, "Ram");
		intMap.put(5, "Amit");
		intMap.put(1, "Rana");
		intMap.put(2, "Sham");
		intMap.put(6, "Babul");
		// default sort by key as its tree Map.
		//System.out.println(intMap);
		
		Set<Entry<Integer, String>> mapEntrySet = intMap.entrySet();
		for (Entry<Integer, String> entry : mapEntrySet) {
			System.out.println(entry.getKey() +" --- >"+entry.getValue());
		}
		
		// write own comparator
		Comparator valueComparator = new Comparator<Entry<Integer,String>>() {
			@Override
			public int compare(Entry<Integer,String> o1, Entry<Integer,String> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}			
		};
		List<Entry<Integer, String>> listEntries = new ArrayList<Entry<Integer, String>>(mapEntrySet);
		
		// sorting
		Collections.sort(listEntries, valueComparator);
		System.out.println(listEntries);
		
	}

}
