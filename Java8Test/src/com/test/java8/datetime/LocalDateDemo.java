package com.test.java8.datetime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;

public class LocalDateDemo {

	public static void main(String[] args) {
		//getLocalDateDemo();
		 DayOfWeek dayOfWeek = LocalDate.parse("2020-02-29").getDayOfWeek();
		 System.out.println(dayOfWeek);
		 int dayOfMonth = LocalDate.parse("2020-02-29").getDayOfMonth();
		System.out.println(dayOfMonth);
		
		LocalDate thisYear = LocalDate.now();
		System.out.println("This year :" +thisYear);
		System.out.println("Is this year leapYear :: " +thisYear.isLeapYear());
		
		LocalDate previousYear = LocalDate.now();
		System.out.println("Previous year : " + previousYear.minusYears(1));
		
		boolean isBefore = LocalDate.parse("2020-02-29").isBefore(LocalDate.parse("2020-03-29"));
		System.out.println("is Before: " +isBefore);
		
		 
	}

	private static void getLocalDateDemo() {
		LocalDate localDate1, localDate2, localDate3, localDate4;
		localDate1 = LocalDate.now();
		System.out.println(localDate1);
		
		Clock clock = Clock.systemDefaultZone();
		localDate2 = LocalDate.now(clock);
		System.out.println(localDate2);
		
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		localDate3 = LocalDate.now(zoneId);
		System.out.println(localDate3);
	}

}
