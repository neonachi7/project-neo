package excercise;
class version{
	version()
	{
		System.out.println("version");
	}
}
class version1 extends version{
	version1()
	{
		System.out.println("version1");
	}
}
public class ConstructorChainning {
public static void main(String[] args) {
	version1 v1=new version1();
	
}
}
