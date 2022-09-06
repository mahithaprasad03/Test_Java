package com.test.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		
		File f = new File ("test.txt");
		
		try {
			
			FileOutputStream fo = new FileOutputStream(f);
			String msg = "File creation success";
			
			byte[] by= msg.getBytes();
			fo.write(by);
			System.out.println("writing success");
		    fo.close();			
		}
		
		catch(IOException e) {
			
			System.out.println("File not found");
		}
	}
}
