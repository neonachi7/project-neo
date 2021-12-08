package excercise;
class Student
{
	String section="LKG";
	int totalStu=23;
	void start()
	{
		System.out.println("class starting");
	}
	void end()
	{
		System.out.println("class ending");
	}
}
public class Reference {
public static void main(String[] args) {
	Student s1=new Student();
System.out.println(s1.section);
System.out.println(s1.totalStu);
s1.start();
s1.end();

	}
}
