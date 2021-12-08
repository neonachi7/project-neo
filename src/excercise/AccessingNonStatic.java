package excercise;
class NonStatic
{
	int a=5;
	void start()
	{
		System.out.println("Stating");
	}
}
public class AccessingNonStatic {
	int b=12;
	void end()
	{
		System.out.println("Ending");
	}
public static void main(String[] args) {
	System.out.println(new AccessingNonStatic().b);
	new AccessingNonStatic().end();
	System.out.println(new NonStatic().a);
	new NonStatic().start();
	
	
	
}
}
