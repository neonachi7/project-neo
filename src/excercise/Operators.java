package excercise;

public class Operators {
public static void main(String[] args) {
	System.out.println("INCREMENT AND DECREMENT");
	int a=5,b=6;
	int res=++a + b--;//6+6=12
	System.out.println(a);//6
	System.out.println(b);//5
	System.out.println(res);
	
	System.out.println();
	System.out.println("CONCADINATION");
	System.out.println(85+6+"marks");
	System.out.println(10+"fail");
	
	System.out.println();
	System.out.println("RELATIONAL");
	System.out.println(a>b);
	System.out.println(a<b);
	System.out.println(a==b);
	System.out.println(a!=b);
	
	System.out.println();
	System.out.println("LOGICAL");
	int c=1,d=2;
	//boolean out=c<d && c++ < d--;//2 1
	boolean out1=c>d || c++ > d--;//
	//System.out.println(out);
	System.out.println(d);
	System.out.println(out1);
	System.out.println(c);
	
	
	
	
}
}
