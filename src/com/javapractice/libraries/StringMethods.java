package com.javapractice.libraries;

public class StringMethods {
public static void main(String[] args) {
	String s1="manish";
	System.out.println(s1.length());
	System.out.println(s1.charAt(2));
	char [] ch=s1.toCharArray();
	for(int i=0;i<s1.length();i++)
	{
		System.out.println(ch[i]);
	}
	String l1=s1.toLowerCase();
	String l2=s1.toUpperCase();
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(s1.indexOf('i'));
	System.out.println(s1.indexOf('s',1));
	System.out.println(s1.startsWith("n"));
	System.out.println(s1.endsWith("h"));
	System.out.println(s1.substring(2));
	System.out.println(s1.substring(0, 2));
	System.out.println(s1.replace('m','a'));
	String st="core java";
	String[] sp=st.split(" ");
	for(int i=0;i<st.length();i++)
	{
		System.out.println(sp[i]);
	}
	
	
}
}
