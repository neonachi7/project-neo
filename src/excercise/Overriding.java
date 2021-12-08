package excercise;
class superclass
{
	void method()
	{
		System.out.println("original");
	}
}
class supclass extends superclass
{
	void method()
	{
		System.out.println("modified");
	}
}
public class Overriding {
public static void main(String[] args) {
	supclass s=new supclass();
	s.method();
}
}
