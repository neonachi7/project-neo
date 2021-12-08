package com.javapractice.star;

public class Program6 {
	public static void main(String[] args) {
		int num=3;
		int count=1;
		int temp=3;
		
		for(int row=1;row<=num;row++)
		{
			for(int col=1;row>=col;col++)
			{
				System.out.print(count-- +" ");
				if(col!=num)
				{
					System.out.print("* ");
				}

			}

			count=count+temp;
			temp=temp+2;
			System.out.println();
		}
	   
}
}
