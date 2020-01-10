package com.test.java8.generic;

public class CacheShart {
	private Shart shart;
	
	public void add(Shart shart) {
		this.shart = shart;
	}
	
	public Shart get() {
		return this.shart;
	}
}
