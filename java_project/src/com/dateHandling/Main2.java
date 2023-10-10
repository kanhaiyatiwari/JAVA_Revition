package com.dateHandling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main2 {
public static void main(String[] args) {
//	parse 
	
//	Scanner  s=new Scanner(System.in);
//	System.out.println("please enter date time to get date");
	String str="12/2020/09";
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/yyyy/MM");
	LocalDate date=LocalDate.parse(str,dtf);
	System.out.println(date);
	//return day
	String day=date.format(DateTimeFormatter.ofPattern("EEEE"));
	System.out.println(day);
}
}
