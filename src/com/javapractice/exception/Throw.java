package com.javapractice.exception;

import java.io.IOException;

class Exam
{
	void question() throws IOException
	{
		System.out.println("question paper");
		//int a=1/0;
		throw new IOException();
	}
}
class Student 
{
	void ans() throws IOException
	{
		System.out.println("writing the answer");
		Exam exam=new Exam();
		exam.question();
		
	}
}
public class Throw {
	public static void main(String[] args) {
		try
		{
			Student student=new Student();
			student.ans();
			
		}
		catch(IOException e)
		{
			System.out.println("exception");
		}
	}

}
