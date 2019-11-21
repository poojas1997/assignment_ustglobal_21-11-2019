package com.ustglobal.filehandling;

import java.io.*;

public class FileReadingClass {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\DELL\\Desktop\\Text.txt.txt";
		FileReader reader = null;				//FileReader reads single value. 
		
		try {
			
			 reader = new FileReader(path);
			 int i;
			 while(( i = reader.read())!= -1) {
				 System.out.print((char)i);
			 }
			
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}//end of main()
}//end of FileReadingClass
