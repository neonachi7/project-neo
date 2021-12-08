package com.javapractice.abstraction;
class demo
{
	
}
class demo1
{
	public int hashCode()
	{
		return 15;
	}
}
public class HashCode {
	public static void main(String[] args) {
		demo dd=new demo();
		System.out.println(dd.hashCode());
		demo1 d1=new demo1();
		System.out.println(d1.hashCode());
	}
}
