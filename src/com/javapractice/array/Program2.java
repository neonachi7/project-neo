package com.javapractice.array;

public class Program2 {
	public static void main(String[] args) {
		int [] ref=new int[2];
		ref[0]=4;
		ref[1]=5;
		
		System.out.println(ref.length);
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}
		System.out.println();
		int [] ref1= {5,3,6};
		int even=0;
		int odd=0;
		for (int i=0;i<ref1.length;i++)
		{
			if(ref1[i]%2==0)
			{
			even=even+ref1[i];
			}
			else
			{
				odd=odd+ref1[i];
			}
			
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
