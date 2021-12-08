package com.javapractice.exception;

import java.util.HashSet;

public class Program2 {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet();
	hs.add("a");
	hs.add("a");
	hs.add("A");
	hs.add("B");
	hs.add("C");
	hs.add("C");
	for(Object ob:hs)
	{
		System.out.println(ob);
	}
}
}
