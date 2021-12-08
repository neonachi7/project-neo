package excercise;
class demo1
{
	int a=2;
}
class demo extends demo1
{
	int a=3;
	void test()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
}
public class Super {
	public static void main(String[] args) {
		demo d=new demo();
		d.test();
	}
	
}
