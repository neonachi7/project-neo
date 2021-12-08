package excercise;
class sample
{
	int a;
	sample(int a)
	{
		this.a=a;
	}
	
}
class sample1 extends sample
{
	sample1(){
		super(2);
	}
}
public class Superstatement {
public static void main(String[] args) {
	sample1 r=new sample1();
	System.out.println(r.a);
	
}
}
