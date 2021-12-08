package excercise;
interface Manager
{
	 void project();
}
interface Lead
{
	 void project();
}

class Coder implements Manager,Lead
{
	public void project()
	{
		System.out.println("Developed the code");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Coder co=new Coder();
		co.project();
	}

}
