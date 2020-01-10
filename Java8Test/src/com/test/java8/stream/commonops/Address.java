package com.test.java8.stream.commonops;

public class Address {
	int roadNo;
	String city;
	int pin;
	public int getRoadNo() {
		return roadNo;
	}
	public void setRoadNo(int roadNo) {
		this.roadNo = roadNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public Address(int roadNo, String city, int pin) {
		super();
		this.roadNo = roadNo;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [roadNo=" + roadNo + ", city=" + city + ", pin=" + pin + "]";
	}	
}
