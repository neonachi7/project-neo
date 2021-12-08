package com.javapractice.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr=new FileReader("D:/Java/test.txt");
			int num=fr.read();
			while(num!=-1)
			{
				System.out.println((char)num);
				num=fr.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
