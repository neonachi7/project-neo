package com.javapractice.libraries;
class Program
{
	String s1="java";
}
public class StringClass {
	public static void main(String[] args) {
		Program p1=new Program();
		System.out.println(p1.s1);
		String s1="java";
		String s2=s1;
		 s1="hai";
		System.out.println(s1);
		System.out.println(s2);
		String s3="";
		String s4=new String("core");
		char [] ch= {'a','b'};
		String s5=new String(ch);
		System.out.println(s5);
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s3.hashCode());
		System.out.println(s3.toString());
		
		String s6="manish";
		String s7="manish";
		String s8=new String("manish");
		String s9=new String("manish");
		System.out.println(s6==s7);
		System.out.println(s8==s9);
		
		
		
		
	}

}
