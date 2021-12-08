package excercise;
class ShoppingMall
{
	void bike()
	{
		System.out.println("bike parking");
	}
}
class Parking extends ShoppingMall
{
	void car()
	{
		System.out.println("extended car parking");
	}
}
class Area extends Parking
{
	void seperate()
	{
		System.out.println("extended separate area car and bike parking");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Area p1=new Area();
		p1.bike();
		p1.car();
		p1.seperate();
	}

}
