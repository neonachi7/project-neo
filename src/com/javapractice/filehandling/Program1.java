package com.javapractice.filehandling;

import java.io.File;
import java.io.IOException;

public class Program1 {
	public static void main(String[] args){
		File f=new File("D:/Java/test.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
