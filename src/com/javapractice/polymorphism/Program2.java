package com.javapractice.polymorphism;
class Showroom
{
	void cost()
	{
		System.out.println("Buy and use");
	}
}
class Audi extends Showroom
{
	void cost()
	{
		System.out.println("Audi car range 1crore");
	}
}
class Ford extends Showroom
{
	void cost()
	{
		System.out.println("Ford car range 12lakhs");
	}
}
class Car
{
	void buy(Showroom ref)
	{
		ref.cost();
	}
}
public class Program2 {
	public static void main(String[] args) {
		Car car=new Car();
		car.buy(new Audi());
		car.buy(new Ford());
	}

}
