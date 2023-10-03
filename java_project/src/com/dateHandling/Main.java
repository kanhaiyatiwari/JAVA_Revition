package com.dateHandling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date.getDayOfWeek());
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime Datetime=LocalDateTime.now();
		System.out.println(Datetime);
		LocalDate dob = LocalDate.of(1985, 02, 20);//(yyyy-MM-dd)
System.out.println(dob);
	}
}
