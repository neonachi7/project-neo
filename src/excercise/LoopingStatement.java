package excercise;

import java.util.Scanner;

public class LoopingStatement {
	public static void main(String[] args) {
		System.out.println("FOR-LOOP");
		System.out.println("2power2");//4
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.println("enter the power:");
		int power=sc.nextInt();
		int out=1;
		/*for(int i=1;i<=power;i++)
		{
			out=out*num;
		}*/
		int i=1;
		/*while(i<=power)
		{
			out=out*num;
			i++;
		}*/
		do
		{
			out=out*num;
			
		}while(i++<power);
		System.out.println("TOTAL=:"+out);
	}

}
