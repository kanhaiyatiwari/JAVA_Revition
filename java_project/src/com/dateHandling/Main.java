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

///is leap year

LocalDate date1=LocalDate.now();
LocalDate d=date1.minusYears(3);
System.out.println(d.isLeapYear());
//at time mathod
LocalDate date2=LocalDate.now();
LocalDateTime d2=date2.atTime(2,45,29);
System.out.println(d2);
	}
}
