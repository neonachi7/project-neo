package excercise;
class Normal
{
	void seat()
	{
		System.out.println("seat confirm");
	}
}
class Vip extends Normal
{
	void specialfood()
	{
		System.out.println("Give specialfood");
	}
}
class Flight extends Vip
{
	void NormalTicket(Normal nm)
	{
		nm.seat();
	}
	void VipTicket(Vip vp)
	{
		vp.specialfood();
	}
	
}
public class TypeCasting {
public static void main(String[] args) {
	Flight fl=new Flight();
	fl.NormalTicket(new Normal());
	fl.NormalTicket(new Vip());
	
	fl.VipTicket(new Vip());
	//fl.VipTicket(new Normal());
	
}
}
