package com.javapractice.polymorphism;
class Restaurent{
	void coupenCode() {
		System.out.println("Taste it");
	}
}
class Zomato extends Restaurent{
	void coupenCode() {
		System.out.println("You will get 15% offer");
	}
}
class Swiggy extends Restaurent{
	void coupenCode() {
		System.out.println("You will get 5% offer");
	}
}
class Food
{
	void offer(Restaurent ref)
	{
		ref.coupenCode();
	}
}
public class Program3 {
	public static void main(String[] args) {
		Food food=new Food();
		food.offer(new Zomato());
		food.offer(new Swiggy());
	}

}
