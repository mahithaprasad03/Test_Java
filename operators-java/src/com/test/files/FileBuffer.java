package com.test.files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileBuffer {

	public static void main(String[] args) {
		
		 FileInputStream fi;
		try {
			fi = new FileInputStream("test.txt");
			BufferedInputStream bi = new BufferedInputStream(fi);
			
			int i;
			while((i=bi.read())!=-1) {
				
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
