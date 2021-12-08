package com.javapractice.star;

public class Program2 {
	public static void main(String[] args) {
		int num=3;
		for(int row=1;row<=num;row++)
		{
			for(int space=1;space<=num-row;space++)
				System.out.print("  ");
		
		{
			for(int star=1;2*row>star;star++)
				if(star%2==0) {
					System.out.print("* ");
				}
				else
				{
					System.out.print(star +" ");
				}
				}
		System.out.println();
		}
		
	}
}
