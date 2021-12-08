package com.javapractice.typecating;
class Kirishnakiri
{
	void a2b()
	{
		System.out.println("morning tiffen");
	}
}
class Hosur extends Kirishnakiri
{
	void checkPost()
	{
		System.out.println("To cross the tamilnasu border");
	}
	
}
class SelamToBangalore
{
	void park(Kirishnakiri ks)
	{
		ks.a2b();
	}
	void token(Hosur hs)
	{
		hs.a2b();
		hs.checkPost();
	}
}
public class Program4 {
	public static void main(String[] args) {
		SelamToBangalore stb=new SelamToBangalore();
		stb.park(new Kirishnakiri());
		stb.park(new Hosur());
		System.out.println();
		stb.token(new Hosur());
		
	}

}
