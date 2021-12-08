package excercise;
class login
{
	void fb_login(String us)
	{
		System.out.println("login with name");
	}
	void fb_login(long number)
	{
		System.out.println("login with number");
	}
}
public class Overloading {
	
public static void main(String[] args) {
	login l=new login();
	l.fb_login("shri");
	l.fb_login(123654789l);
	
}
}
