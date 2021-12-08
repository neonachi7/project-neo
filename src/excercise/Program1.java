package excercise;
class pizza
{
	String pan;
	String size;
	pizza()
	{
		pan="normal";
		size="regular";
	}
	pizza(String pan,String pansize)
	{
		this.pan=pan;
		size=pansize;
		
	}
	
}

public class Program1 {
	
	public static void main(String[] args) {
		pizza pi=new pizza();
		System.out.println(pi.pan);
		System.out.println(pi.size);
		
		pizza p=new pizza("special","large");
		System.out.println(p.pan);
		System.out.println(p.size);
		
	}

}

