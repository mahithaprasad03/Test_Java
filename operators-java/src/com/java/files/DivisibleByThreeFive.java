package com.java.files;

public class DivisibleByThreeFive {

	public static void main(String[] args) {
		
		for(int i=1;i<=200;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}
