package com.java.files;

public class SwapWithout {

	public static void main(String[] args) {
		
		int a=1,b=2;
		
		System.out.println("Before swap, value of a="+a+" b="+b);
		
		a= a-b; // 1-2
	    b= a+b; // (1-2)+2
		a= b-a;     // {(1-2)+2}-(1-2)
		
		System.out.println("After swap, value of a="+a+" b="+b);		

	}

}
