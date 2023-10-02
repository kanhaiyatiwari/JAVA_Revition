package com.masai;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ex1();
//		ex1solve();
		ex2();

	}
	
	public static void ex1() {
	String str="abc";
	
	int n=Integer.parseInt(str);
	System.out.println(n/0);
	}
	
	public static void ex1solve() {
		try{String str="abc";
		
		int n=Integer.parseInt(str);
		System.out.println(n/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(NumberFormatException e) {
	System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		}
public static void ex2() {
	
	try{
		int a[]=new int[5];
		
		//System.out.println(a[7]);
		System.out.println(30/0);
		}
		catch(ArithmeticException e)
		{
		System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("ArrayIndexOutOfBounds Exception occurs");
		}
		catch(Exception e)
		{
		System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
		}


}
