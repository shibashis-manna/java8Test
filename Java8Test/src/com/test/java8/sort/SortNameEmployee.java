package com.test.java8.sort;

import java.util.Comparator;

public class SortNameEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		int result = o1.getSname().compareTo(o2.getSname());
		if(result>0) return 1;
		else if(result <0 ) return -1;
		else return 0;
	}

	

}
