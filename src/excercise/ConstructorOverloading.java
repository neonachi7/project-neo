package excercise;
class Dominos
{
	String pan;
	String cheese;
	Dominos()
	{
		
		pan="normal";
		cheese="regular";
	}
	Dominos(String pan,String cheese)
	{
		this.pan=pan;
		this.cheese=cheese;
	}
}
public class ConstructorOverloading {
	public static void main(String[] args) {
		Dominos d1=new Dominos();
		System.out.println(d1.pan);
		System.out.println(d1.cheese);
		
		Dominos d2=new Dominos("fresh","extra");
		System.out.println(d2.pan);
		System.out.println(d2.cheese);
	}

}
