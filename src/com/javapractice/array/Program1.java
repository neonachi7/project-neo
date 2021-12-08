package com.javapractice.array;

public class Program1 {
	public static void main(String[] args) {
		int [] ref;
		ref=new int[3];
		ref[0]=45;
		ref[1]=15;
		ref[2]=5;
		System.out.println(ref[0]);
		System.out.println(ref[1]);
		System.out.println(ref[2]);
		
		for(int i=0;i<ref.length;i++)
		{
			System.out.println(ref[i]);
		}
		for(int num:ref)
		{
			System.out.println(num);
		}
}

}
