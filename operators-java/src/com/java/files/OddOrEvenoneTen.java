package com.java.files;
//20)	WAP to print if the number if odd or even from 1 to 10
public class OddOrEvenoneTen {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			
			int res=i%2;
			if(res==0) {
				System.out.println(i+" is even");
			}
			else {
				System.out.println(i+" is odd");
	
			}
		}
	}

}
