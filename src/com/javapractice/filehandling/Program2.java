package com.javapractice.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) {
		String text="welcome";
		FileWriter fw=null;
		
		try {
			fw = new FileWriter("D:/Java/test.txt");
			fw.write(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
