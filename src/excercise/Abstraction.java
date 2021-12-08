package excercise;
abstract class Exam
{
	abstract void paper1();
	abstract void paper2();
}
abstract class QuestionPaper1 extends Exam
{
	void paper1()
	{
		System.out.println("uploaded question paper1");
	}
}
class QuestionPaper2 extends QuestionPaper1
{
	void paper2()
	{
		System.out.println("uploaded question paper2");
	}
}
public class Abstraction {
public static void main(String[] args) {
	QuestionPaper2 qp=new QuestionPaper2();
	qp.paper1();
	qp.paper2();
}
}
