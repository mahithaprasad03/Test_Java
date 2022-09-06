package com.test.files;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) {
		
		try{
			
			FileWriter fo = new FileWriter("test1.txt");
			
			String msg = "Continue Writing";
			
			//char[] res= msg.toCharArray();
			
			fo.write(msg);
			
			fo.close();
			
			System.out.println("Finished");
		}
		
		catch(IOException e){
			
			e.printStackTrace();

}
	}
}
