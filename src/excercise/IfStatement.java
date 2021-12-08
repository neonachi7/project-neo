package excercise;

public class IfStatement {
	private static final String Drawing = null;

	public static void main(String[] args) {
		System.out.println("IF-STATEMENT");
		boolean human=true;
		System.out.println(human);
		
		System.out.println();
		System.out.println("IF-ELSE-STATEMENT");
		boolean human1=true;
		if(human1==true){
			System.out.println("YES");
		}else
		System.out.println("NO");
		
		System.out.println();
		System.out.println("ELSE-IF-LADDER");
		System.out.println("COMPANY");
		int floor=2;
		if(floor==1){
			System.out.println(" I AM WORKING IN 1ST FLOOR");
		}else if(floor==2)
		{
			System.out.println(" I AM WORKING IN 2ND FLOOR");
		}else
		{
			System.out.println("NO COMING FROM OUTSIDE");
		}
		
		System.out.println();
		System.out.println("NESTED-IF");
		System.out.println("SCHOOL EVENT");
		boolean invitation=true;
		if(invitation==true)
		{
			boolean id=true;
			if(id==true)
			{
				System.out.println("welcome");
			}else
			{
				System.out.println("ID CARD MUST");
			}
		}else
		{
			System.out.println("NO UR NOT ALLOWED");
		}
	}

}
