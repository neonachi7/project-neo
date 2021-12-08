package com.javapractice.exception;

import java.util.ArrayList;

public class Program5 {
public static void main(String[] args) {
	System.out.println("boxing");
	Integer a=new Integer(15);
	System.out.println(a);
	Double c=1.2;
	System.out.println(c);
	
	System.out.println("unboxing");
	Integer a1=new Integer(56);
	System.out.println(a1);
	int b=a1;
	System.out.println(b);
	
	System.out.println("String");
	String s1="456";
	System.out.println(Integer.parseInt(s1));
	
	System.out.println("ArrayList");
	ArrayList al=new ArrayList();
	al.add(3);
	al.add(3.3);
	al.add(123654789l);
	al.add(true);
	al.add('a');
	for(Object ob:al)
	{
		System.out.println(ob);
	}
	
}
}
