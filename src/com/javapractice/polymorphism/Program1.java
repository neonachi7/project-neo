package com.javapractice.polymorphism;
class MovieStreaming
{
	void fireStick()
	{
		System.out.println("access to firestick");
	}
}
class Prime extends MovieStreaming
{

	void fireStick()
	{
		System.out.println("using fireStick to access the prime movies");
	}
}
class Hotstar extends MovieStreaming
{

	void fireStick()
	{
		System.out.println("using fireStick to access the hotstar movies");
	}
}
class Tv
{
	void device(MovieStreaming ref)
	{
		ref.fireStick();
	}
}
public class Program1 {
	public static void main(String[] args) {
		Tv tv=new Tv();
		tv.device(new Prime());
		tv.device(new Hotstar());
	}

}
