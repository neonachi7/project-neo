package excercise;
class Charger
{
	int cost;
	int port;
	Charger()
	{
		cost=500;
	}
	Charger(int port)
	{ this();
		this.port=port;
	}
}
public class Constructor {
	public static void main(String[] args) {
		Charger ch=new Charger(1);
		System.out.println(ch.cost);
		System.out.println(ch.port);
	}

}
