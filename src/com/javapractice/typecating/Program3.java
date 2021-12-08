package com.javapractice.typecating;
class NormalMember
{
	void oldMovie()
	{
		System.out.println("access to only old movies");
	}
}
class PrimeMember extends NormalMember
{
	void latestMovie()
	{
		System.out.println("access to only latest movies");
	}
}

class HotStar
{
	void member(NormalMember nm)
	{
		nm.oldMovie();
	}
	void paidMember(PrimeMember pm)
	
	{
		pm.oldMovie();
		pm.latestMovie();
	}
}


public class Program3 {
	public static void main(String[] args) {
		HotStar hs=new HotStar();
		hs.member(new NormalMember());
		hs.member(new PrimeMember());
		System.out.println();
		hs.paidMember(new PrimeMember());
		
	}

}
