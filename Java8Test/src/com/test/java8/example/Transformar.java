package com.test.java8.example;

public class Transformar {
	String tid;
	Integer summerRating;
	Integer winterRating;
	String summerValue;
	String winterValue;
	String otherOption;
	public Transformar(String tid, Integer summerRating, Integer winterRating, String summerValue, String winterValue,
			String otherOption) {
		super();
		this.tid = tid;
		this.summerRating = summerRating;
		this.winterRating = winterRating;
		this.summerValue = summerValue;
		this.winterValue = winterValue;
		this.otherOption = otherOption;
	}
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public Integer getSummerRating() {
		return summerRating;
	}
	public void setSummerRating(Integer summerRating) {
		this.summerRating = summerRating;
	}
	public Integer getWinterRating() {
		return winterRating;
	}
	public void setWinterRating(Integer winterRating) {
		this.winterRating = winterRating;
	}
	public String getSummerValue() {
		return summerValue;
	}
	public void setSummerValue(String summerValue) {
		this.summerValue = summerValue;
	}
	public String getWinterValue() {
		return winterValue;
	}
	public void setWinterValue(String winterValue) {
		this.winterValue = winterValue;
	}
	public String getOtherOption() {
		return otherOption;
	}
	public void setOtherOption(String otherOption) {
		this.otherOption = otherOption;
	}
	@Override
	public String toString() {
		return "Transformar [tid=" + tid + ", summerRating=" + summerRating + ", winterRating=" + winterRating
				+ ", summerValue=" + summerValue + ", winterValue=" + winterValue + ", otherOption=" + otherOption
				+ "]";
	}
}
