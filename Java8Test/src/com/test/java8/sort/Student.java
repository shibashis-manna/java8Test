package com.test.java8.sort;

public class Student implements Comparable<Student>{
	private String sname;
	private int sage;
	private String sclass;	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String sname, int sage, String sclass) {
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
		return "Student [sname=" + sname + ", sage=" + sage + ", sclass=" + sclass + "]";
	}

	@Override
	public int compareTo(Student o) {
		int result = this.sname.compareTo(o.getSname());
		if(result>0) return 1;
		else if(result <0 ) return -1;
		else return 0;		
	}
	
	

}
