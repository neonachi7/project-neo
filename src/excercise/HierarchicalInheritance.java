package excercise;
class brandBand
{
	void internet()
	{
		System.out.println("Provide the internet");
	}
	void plans()
	{
		System.out.println("based on the pack");
	}
}
class bsnl extends brandBand
{
	void bsnlPort()
	{
		System.out.println("some pack offer available");
	}
}
class airtel extends brandBand
{
	void airtelPort()
	{
		System.out.println("net available everywere");
	}
}
class HierarchicalInheritance {
	public static void main(String[] args) {
		bsnl b=new bsnl();
				b.internet();
		b.plans();
		b.bsnlPort();
		System.out.println();
		airtel a1=new airtel();
		a1.internet();
		a1.airtelPort();
		a1.plans();
	}

}
