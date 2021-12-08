package com.javapractice.typecating;
class Landline
{
	void call()
	{
		System.out.println("calling");
	}

}
class Mobile extends Landline
{
	void watch()
	{
		System.out.println("watching");
	}
}
class Disturb extends Mobile
{
}
public class Program1 {
	public static void main(String[] args) {
		Landline l1=new Mobile();
		l1.call();//upcasting
		//l1.watch();
		Disturb d=new Disturb();
		d.watch();
	
		
		
		
	}

}
