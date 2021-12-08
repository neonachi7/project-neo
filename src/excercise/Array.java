package excercise;

public class Array {
public static void main(String[] args) {
	int [] num=new int[3];
	num[0]=45;
	num[1]=56;
	num[2]=25;
	
	for(int i=0;i<num.length;i++)
	{
		System.out.println(num[i]);
	}
	for(int num2:num)
	{
		System.out.println(num2);
	}
	
	char [] num2={'a','b'};
	for(char num3:num2)
	{
		System.out.println(num3);
	}
}
}
