package com.java.files;
import java.util.Scanner;

public class SumOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number to perform addition"+'\n');
		int a=input.nextInt();
		System.out.println("Enter second number to perform addition"+'\n');
		int b=input.nextInt();
		System.out.println("Enter third number to perform addition"+'\n');
		int c=input.nextInt();
		int sum=a+b+c;
		System.out.println("Sum of 3 numbers is "+sum );		

	}

}
