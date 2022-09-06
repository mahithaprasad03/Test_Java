package com.java.files;
//11)	WAP to swap two numbers using temporary variable

class SwapTwo{	
	
	void swap(int a,int b) {
		
		System.out.println("Before swap results are a="+a+" b="+b);
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("After swapped results are a="+a+" b="+b);		
	}	
}
public class Swap {

	public static void main(String[] args) {
		
		int a=9;
		int b=10;
		
		SwapTwo obj = new SwapTwo();
		obj.swap(a, b);
	}

}
