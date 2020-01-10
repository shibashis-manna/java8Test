package com.test.java8.generic;

public class GenericTest {

	public static void main(String[] args) {
		
		/*CacheString cs = new CacheString();
		cs.add("test message");
		
		System.out.println(cs.get());*/
		
		//2nd call
		/*
		Shart shart = new Shart("24", "Cotton");
		CacheShart cst = new CacheShart();
		cst.add(shart);
		
		System.out.println(cst.get().toString());*/
		
		//Generic example
		Shart shart = new Shart("24", "Cotton");
		CacheAny<Shart> ca = new CacheAny<>();
		ca.add(shart);		
		System.out.println(ca.get().toString());
		
		
		CacheAny<String> st = new CacheAny<>();
		st.add("My Generic");		
		System.out.println(st.get());
		

	}

}
