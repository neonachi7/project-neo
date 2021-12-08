package com.javapractice.star;

public class Program3 {
	public static void main(String[] args) {
		int num=5;
		
		for(int row=1;row<=num;row++)
		{
			int count=1;
			for(int space=1;space<=num-row;space++) 
			{
				System.out.print("  ");
			}
				for(int star=1;2*row>star;star++) 
				{
					if(row>star)
					{
				   System.out.print(count++ +" ");	
				}
					else
					{
						System.out.print(count-- +" ");
				}
				
			    }  
				System.out.println();		
		}
		 
	}

	}
