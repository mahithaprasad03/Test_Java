package com.java.files;

//1)	WAP to find sum of two numbers


import java.util.Scanner;

class Sum{
	
	void add(int a,int b){
		
		int c=a+b;
		System.out.println("sum is "+c );
	}
}

public class SumOfTwo {

	public static void main(String[] args) {
		
		Sum obj=new Sum();
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number to add");
		int a=input.nextInt();
		System.out.println("Enter the second number to add");
		Scanner input2= new Scanner(System.in);
		int b=input2.nextInt();		
		obj.add(a,b);
	}
}
