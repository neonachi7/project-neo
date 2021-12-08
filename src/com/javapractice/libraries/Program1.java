package com.javapractice.libraries;

import java.util.ArrayList;
import java.util.LinkedList;

import com.javapractice.exception.Bag;
import com.javapractice.exception.WaterBottle;

public class Program1 {
public static void main(String[] args) {
	/*LinkedList l1=new LinkedList();
	
	l1.add(new Bag("leather"));
	l1.add(new WaterBottle("one"));
	System.out.println(l1.size());
	
	l1.add(null);
	l1.add(new Bag("leather"));
	l1.add(new WaterBottle("one"));
	System.out.println(l1.size());
	
	l1.add(1,"java");
	System.out.println("output 1st");
	for(Object ob:l1)
	{
		System.out.println(ob);
	}
	
	
	ArrayList a1=new ArrayList(l1);
	System.out.println(a1.size());
	System.out.println("output 2nd");
	for(int i=0;i<a1.size();i++)
	{
		Object ob=a1.get(i);
		System.out.println(ob);
	}
	*/
	LinkedList l1=new LinkedList();
	l1.add(new WaterBottle("one"));
	l1.add(1,"java");
	System.out.println(l1.size());
	
	for(Object od:l1)
	{
		System.out.println(od);
	}
	System.out.println();
	ArrayList a1=new ArrayList(l1);
	a1.add(new Bag("leather"));
	System.out.println(a1.size());
	for(Object ob:a1)
	{
		System.out.println(ob);
	}
}
}
