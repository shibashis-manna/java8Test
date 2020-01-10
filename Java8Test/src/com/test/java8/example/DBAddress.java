package com.test.java8.example;

public class DBAddress {
	String roadNo;
	String houseNo;
	String pin;
	public DBAddress(String roadNo, String houseNo, String pin) {
		super();
		this.roadNo = roadNo;
		this.houseNo = houseNo;
		this.pin = pin;
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
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "DBAddress [roadNo=" + roadNo + ", houseNo=" + houseNo + ", pin=" + pin + "]";
	}	
}
