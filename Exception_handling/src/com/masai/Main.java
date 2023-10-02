package com.masai;

public class Main {
//handle Arithmatic exeption
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ex1solve();
//		ex2solve();
//		ex3solve();
		//ex4();
		ex4solve();
	}
	
	public static  void ex1() {
//		without exception handling
		int n=10/0;
		System.out.println(n);
		System.out.println("rest code");
//		here we will get a arith matic exception
	}
	
	public static void ex1solve() {
		try {
			int n=10/0;
			System.out.println(n);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
	// NullPointerException
	public static void  ex2() {
	String str=null;
	System.out.println(str.length());
	}
	public static void ex2solve() {
		try {
			String str=null;
			System.out.println(str.length());
		}
		catch( NullPointerException e) {
			System.out.println(e);
		}
	}
	
	//numberforMateExeption
	
	public static void  ex3() {
		String str="abc";
		int n=Integer.parseInt(str);
		System.out.println(n);
		}
	
	
	public static void  ex3solve() {
		try {
		String str="abc";
		int n=Integer.parseInt(str);
		System.out.println(n);
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		}
	
//	OutOfBoundException
	public static void  ex4() {
		String str="abc";
		
		System.out.println(str.charAt(4));
		}
	
	
	public static void  ex4solve() {
		try {
			String str="abc";
			
			System.out.println(str.charAt(4));
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		}
}
