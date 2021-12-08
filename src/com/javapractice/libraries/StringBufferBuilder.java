package com.javapractice.libraries;

public class StringBufferBuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("core");
		System.out.println(sb);
		sb.append("java");
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuilder s1=new StringBuilder("a");
		StringBuilder s2=new StringBuilder("a");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.equals(s2));
		
	}

}
