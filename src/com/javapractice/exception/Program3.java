package com.javapractice.exception;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;
class Product implements Comparable
{
	
	String name;
	int id;
	double cost;
	public Product(String name,int id,double cost)
	{
		
		this.name=name;
		this.id=id;
		this.cost=cost;
	}
	public String toString()
	{
	return "Product[name-"+name+":id-"+id+":cost-"+cost+"]";
	
	}
	
	public int compareTo(Object o) 
	{
		Product pt=(Product)o;
		//return this.id-pt.id;
		//return (int)(this.cost-pt.cost);
		String s1=this.name;
		String s2=pt.name;
		int value=s1.compareTo(s2);
		return value;
	}
	
}
class sortId implements Comparator
{
	public int compare(Object o1, Object o2) {
		Product pt1=(Product)o1;
		Product pt2=(Product)o2;
		return pt1.id-pt2.id;
	}
	
}
class sortCost implements Comparator
{
	public int compare(Object o1, Object o2) {
		Product pt1=(Product)o1;
		Product pt2=(Product)o2;
		return (int)(pt1.cost-pt2.cost);
	}
	
}
public class Program3 {
	public static void main(String[] args) {
		Product p1=new Product("laptop",01,50000);
		Product p2=new Product("tv",02,550000);
		Product p3=new Product("mobile",03,25000);
		Product p4=new Product("pen",04,100);
		Product p5=new Product("knife",05,20);
		
		TreeSet ts=new TreeSet();
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		ts.add(p5);
		System.out.println("first tree");
		for(Object ob:ts)
		{
			System.out.println(ob);
		}

	TreeSet ts1=new TreeSet(new sortId());
	ts1.add(p1);
	ts1.add(p2);
	ts1.add(p3);
	ts1.add(p4);
	ts1.add(p5);
		System.out.println("second tree");
		for(Object ob:ts1)
		{
			System.out.println(ob);
		}

		TreeSet ts2=new TreeSet(new sortCost());
		ts2.add(p1);
		ts2.add(p2);
		ts2.add(p3);
		ts2.add(p4);
		ts2.add(p5);
		System.out.println("third tree");
		for(Object ob:ts2)
		{
			System.out.println(ob);
		}
	}

}
