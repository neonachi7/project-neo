package com.javapractice.star;

public class Program8 {
	static int fact(int num)
	{
		int out=1;
		for(int i=num;i>1;i--)
		{
			out=out*i;
		}
		return out;
	}
	static boolean strong(int num)
	{
		int res=0;
		int temp=num;//145
		while(num!=0)
		{
			int last=num%10;//5
			res=res+fact(last);
			num=num/10;//14
		}
		return temp==res;
	}
	public static void main(String[] args) {
		int	count=0;
		int sum=0;	
			for(int num=1;count<=2;num++)
			{
				boolean ans=strong(num);
				if(ans)
				{
					System.out.println(num);
					count++;
					sum=sum+num;
				}
				//System.out.println(sum);
			}
		System.out.println(sum);
		/*for(int num=1;num<=1000;num++) {
			boolean ans=strong(num);
			if(ans)
			{
			System.out.println(num);
			}
		}*/
		/*boolean ans=strong(56);
		if(ans)
		{
		System.out.println("strong number");
		}
		else
		{
			System.out.println("not strong number");
		}*/
	}

}
