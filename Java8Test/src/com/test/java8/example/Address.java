package com.test.java8.example;

public class Address {
	String roadNo;
	String houseNo;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String roadNo, String houseNo) {
		super();
		this.roadNo = roadNo;
		this.houseNo = houseNo;
		
	}
	public String getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(String roadNo) {
		this.roadNo = roadNo;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	@Override
	public String toString() {
		return "DBAddress [roadNo=" + roadNo + ", houseNo=" + houseNo + "]";
	}	
}
