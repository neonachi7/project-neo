package com.javapractice.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println(a);
	int b=sc.nextInt();
	System.out.println(b);
	int c=a/b;
	System.out.println(c);
	
	}
	catch(InputMismatchException ref)
	{
		System.out.println("InputMismatchException");
	}
	catch(ArithmeticException ref)
	{
		System.out.println("ArithmeticException");
	}
	finally
	{
		System.exit(0);
		System.out.println("finalmethod");
	}
}
}
