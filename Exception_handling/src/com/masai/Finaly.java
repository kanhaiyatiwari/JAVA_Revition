package com.masai;

public class Finaly {
public static void main(String[] args) {
	
	try {
		System.out.println(10/0);
	}
	catch(Exception e) {
		System.out.println("this is exception  - "+e);
	}
	finally{
		System.out.println("this is final");
	}
	System.out.println("this is main");
}
}
