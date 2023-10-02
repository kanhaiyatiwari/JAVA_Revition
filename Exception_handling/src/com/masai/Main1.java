package com.masai;

public class Main1 {
public static void main(String[] args) {
	//ex1(15);
	try {
		//System.out.println("elloh");
		ex2(9);
	} catch (Mycustomex e) {
		// TODO Auto-generated catch block
	System.out.println("elloh"+e.getMessage());
	}
	
}

//throw

public static void ex1(int n) {
	if(n<18) {
		throw new ArithmeticException("not alow to kids");
	}
	else {
		System.out.println("welcom kids");
	}
}

public static void ex2(int n) throws Mycustomex  {
	if(n<18) {
		throw new Mycustomex("not alow to kids");
	}
	else {
		System.out.println("welcom kids");
	}
}
}
