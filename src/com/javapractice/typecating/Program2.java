package com.javapractice.typecating;
class MovieTicket
{
	void movie()
	{
		System.out.println("nearScreen");
	}

}
class OnlineMovieTicket extends MovieTicket
{
	void seatConfirm()
	{
		System.out.println("bookingOnline");
	}
}
class BoxMovieTicket extends OnlineMovieTicket
{
	void snakes()
	{
		System.out.println("couple");
		
	}
	
}
class Theatre
{
	void counterTicket(MovieTicket mt)
	{
		mt.movie();
	}
	void bookingOnline(OnlineMovieTicket omt)
	{
		omt.movie();
		omt.seatConfirm();
	}
	void couple(BoxMovieTicket bmt)
	{
		bmt.movie();
		bmt.seatConfirm();
		bmt.snakes();
	}
}
public class Program2 {
	public static void main(String[] args) {
		Theatre t1=new Theatre();
		t1.counterTicket(new MovieTicket());
		t1.counterTicket(new OnlineMovieTicket());
		t1.counterTicket(new BoxMovieTicket());
		System.out.println();
		t1.bookingOnline(new OnlineMovieTicket());
		t1.bookingOnline(new BoxMovieTicket());
		System.out.println();
		t1.couple(new BoxMovieTicket());
		
		}

}
