package com.javapractice.exception;

import java.util.HashSet;

class CurrencyNote
{
	int cost;
	String color;
	CurrencyNote(int cost,String color)
	{
		this.cost=cost;
		this.color=color;
	}
	public String toString()
	{
		return cost+color;
	}
	public int hashCode()
	{
		return cost;
	}
	public boolean equals(Object ob)
	{
		CurrencyNote ct=(CurrencyNote)ob;
		return this.cost==ct.cost;
	}
}
public class Program1 {
public static void main(String[] args) {
	CurrencyNote cn=new CurrencyNote(2000,"purple");
	CurrencyNote cn1=new CurrencyNote(2000,"purple");
	System.out.println(cn.hashCode());
	System.out.println(cn1.hashCode());
	System.out.println(cn.equals(cn1));
	HashSet hs=new HashSet();
	hs.add(cn);
	hs.add(cn1);
	for(Object ob:hs)
	{
		System.out.println(ob);
	}
	
}
}
