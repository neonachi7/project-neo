package com.javapractice.star;

public class Program5 {
	 
	public static int fact(int num)
	{
		int out = 1;
		for(int i=num;i>=1;i--)
		{
			 out=out*i;
			
		}
		return out;
	}
	static int out1 = 1;
	public static int fact1(int num)
	{
		
	if(num>1)
		{
		out1=out1*num--;
			 fact1(num);
			
		}
		return out1;
	}
	
	public static void main(String[] args) {
		int ans=fact(4);
		System.out.println(ans);
		int ans1=fact1(4);
		System.out.println(ans1);
	}

}
