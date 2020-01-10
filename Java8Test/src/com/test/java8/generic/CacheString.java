package com.test.java8.generic;

public class CacheString {
	private String message;
	
	public void add(String msg) {
		this.message = msg;
	}
	
	public String get() {
		return this.message;
	}
}
