package com.test.files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		
		try {
			
		     FileInputStream fi = new FileInputStream("tes.txt");
		     
		    int msg;
		    
		    while((msg=fi.read())!=-1) {
		    	
		    	System.out.print((char)msg);
		    	
		    }
		    
		    fi.close();		
		}
		
		catch(IOException e) {
			
			System.out.println("File not found");
		}

	}

}
