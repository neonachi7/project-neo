package com.javapractice.polymorphism;
class Plans
{
	void pack() {
		System.out.println("internet pack");
	}
}
class MonthlyPack extends Plans
{
	void pack() {
		System.out.println("Get extra 500Gb");
	}
}
class sixmonthPack extends Plans
{
	void pack() {
		System.out.println("Get extra 1000Gb");
	}
}
class YearlyPack extends Plans
{
	void pack() {
		System.out.println("Get extra 1500Gb");
	}
}
class Act
{
	void internet(Plans ref) {
		ref.pack();
	}
}
public class Program4 {
	public static void main(String[] args) {
		Act act=new Act();
		act.internet(new MonthlyPack());
		act.internet(new sixmonthPack());
		act.internet(new YearlyPack());
		
	}

}
