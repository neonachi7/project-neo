package com.javapractice.star;

public class Program7 {
	static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
	int	count=0;
	int sum=0;	
		for(int num=1;count<2;num++)
		{
			boolean ans=isPerfect(num);
			if(ans)
			{
				System.out.println(num);
				count++;
				sum=sum+num;
			}
			//System.out.println(sum);
		}
		System.out.println(sum);
		/*for(int num=1;num<=1000;num++)
		{
			boolean ans=isPerfect(num);
			if(ans)
			{
			System.out.println(num);
			}
		}*/
		/*boolean ans=isPerfect(28);
		if(ans)
		{
		System.out.println("perfect number");
		}
		else
		{
			System.out.println("not perfect number");
		}*/
	}

}
