package com.javapractice.star;
public class Program4 {
	public static void recursion(int a)
	{
		if(a>=1)
		{
			System.out.print(a +" ");
			a--;
			recursion(a);
		}
	
	
	}
	public static void recursion1(int a)
	{
	if (a<=9)
	{
		System.out.print(a +" ");
		a++;
		recursion1(a);
	}
	}
	public static void main(String[] args) {
		recursion(9);
		recursion1(2);
	}

}
