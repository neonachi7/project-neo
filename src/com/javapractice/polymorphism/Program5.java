package com.javapractice.polymorphism;
class Java
{
	void skill()
	{
		System.out.println("regular and Practice ");
	}
}
class Regular extends Java
{
	void skill()
	{
		System.out.println("To attend the class regularly,get knowledge ");
	}
}
class Practice extends Java
{
	void skill()
	{
		System.out.println("To get more knowledge ");
	}
}
class Student
{
	void attence(Java java) {
		java.skill();
	}
}

public class Program5 {
public static void main(String[] args) {
Student stu=new Student();
stu.attence(new Regular());
stu.attence(new Practice());
}
}
