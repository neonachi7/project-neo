package com.javapractice.exception;

public class Bag {
	String material;
	public Bag(String material)
	{
		this.material=material;
	}
	public String toString()
	{
		return "Bag[material="+material+"]";
	}
}
 class WaterBottle {
	 String count;
	public WaterBottle(String count)
	{
		this.count=count;
	}
	public String toString()
	{
		return "WaterBottle[count="+count+"]";
	}
}
