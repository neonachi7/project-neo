package excercise;
class Internet
{
	void pack()
	{
		System.out.println("internet offer");
	}
}
class MonthlyPack  extends Internet
{
	void pack()
	{
		System.out.println("extra 100gb offer");
	}
}
class SixMonthPack extends Internet 
{
	void pack()
	{
		System.out.println("extra 500gb offer");
	}
}
class Jio
{
	void browser(Internet in) 
	{
		in.pack();
		
	}
}
public class Polymorphism {
public static void main(String[] args) {
	Jio jio=new Jio();
	jio.browser(new MonthlyPack());
	jio.browser(new SixMonthPack());
}
}
