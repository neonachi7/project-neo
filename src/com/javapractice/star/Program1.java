package com.javapractice.star;

public class Program1 {
	public static void main(String[] args) {
		int num=3;
		char count='a';
		for(int row=1;row<=num;row++)
		{
			for(int space=1;space<=num-row;space++)
				System.out.print("  ");
		
		{
			for(int star=1;2*row>star;star++)
				System.out.print(count++ +" ");
				
		}
		System.out.println();
		}
		
		for(int row=num-1;row>=1;row--)
		{
			for(int space=1;space<=num-row;space++)
				System.out.print("  ");
		
		{
			for(int star=1;2*row>star;star++)
				System.out.print(count++ +" ");
				
		}
		System.out.println();
		}
		
	}

}
