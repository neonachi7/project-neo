package com.javapractice.star;

class Program9
{
	static int lcm(int num1,int num2)//30,45
	{
		int max=num1;//30
		if(num1<num2)
		{
			max=num2;//45
		}
		int temp=max;//45
		while(true)
		{
			if(max%num1==0 && max%num2==0)//30%45==0 45%45==0 
			{
				return max;
			}
			max=max+temp;//30+45=75
		}
	}
	public static void main(String[] args)
	{
		int ans=lcm(30,45);
		System.out.println(ans);
	}
}