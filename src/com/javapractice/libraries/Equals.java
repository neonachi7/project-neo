package com.javapractice.libraries;
class sample
{
	int num;
	public sample(int num)
	{
		this.num=num;
	}
	public boolean equals(Object ob)
	{
		sample d=(sample)ob;
		return this.num==num;
		
	}
}
public class Equals {
public static void main(String[] args) {
	sample d=new sample(12);
	sample d1=new sample(12);
	System.out.println(d==d1);
	System.out.println(d.equals(d1));
	String s1="java";
	String s2=new String("java");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
}
}
