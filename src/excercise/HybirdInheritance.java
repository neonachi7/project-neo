package excercise;
interface car
{
	 void drive();
}
class bus 
{
	void travel() {
		System.out.println("Travel one place to another place");
	}
}
class Road extends bus implements car
{
	public void drive()
	{
		System.out.println("Shopping");
	}
	
}
public class HybirdInheritance {
public static void main(String[] args) {
	Road ro=new Road();
	ro.travel();
	ro.drive();
}
}
