package excercise;
class Sample1
{
	void test1()
	{
		System.out.println("testing1");
	}
}
class Sample2 extends Sample1
{

	void test2()
	{
		System.out.println("testing2");
	}
	
}
class Sample3 extends Sample2
{

	void test3()
	{
		System.out.println("testing3");
	}
}
public class DownCasting {
	public static void main(String[] args) {
		Sample1 s1=new Sample2();
		s1.test1();
		if(s1 instanceof Sample3)
		{
			Sample3 s3=(Sample3)s1;
			System.out.println("downcast successfull");
		}else
		{
			System.out.println("downcast not successfull");
		}
		if(s1 instanceof Sample2)
		{
			Sample2 s2=(Sample2)s1;
			System.out.println("downcast successfull");
		}else
		{
			System.out.println("downcast not successfull");
		}
	}
}
