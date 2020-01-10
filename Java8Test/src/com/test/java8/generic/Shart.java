package com.test.java8.generic;

public class Shart {
	private String size;
	private String type;
	
	
	public Shart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shart(String size, String type) {
		super();
		this.size = size;
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Shart [size=" + size + ", type=" + type + "]";
	}
	
	
}
