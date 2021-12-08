package excercise;
class CreditCard
{
	static int a=55;
	static void run()
	{
		System.out.println("running");
	}
}
public class AccessingStatic {
	static int b=20;
	static void racing()
	{
		System.out.println("racing");
	}
	public static void main(String[] args) {
		System.out.println(b);
		racing();
		System.out.println(CreditCard.a);
		CreditCard.run();
		
	}

}
