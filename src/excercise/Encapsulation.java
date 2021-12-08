package excercise;
class Card
{
	private int otp;
	Card(int otp)
	{
		this.otp=otp;
	}
	public void set(int otp)
	{
	
		System.out.print("updated ");
		this.otp=otp;
	}
	public int get()
	{
		System.out.println("generated otp");
		
		return otp;
	}
	
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Card card=new Card(12);
		int num=card.get();
		System.out.println(num);
		card.set(25);
		int num1=card.get();
		System.out.println(num1);
		
	}

}
