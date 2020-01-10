package com.test.java8.map;

public class Employee {
	private String sname;
	private int sage;
	private String sclass;	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String sname, int sage, String sclass) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.sclass = sclass;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSclass() {
		return sclass;
	}
	public void setSclass(String sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "Employee [sname=" + sname + ", sage=" + sage + ", sclass=" + sclass + "]";
	}

}
