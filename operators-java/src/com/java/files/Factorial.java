package com.java.files;
import java.util.Scanner;

//27)	WAP to find the factorial of given number

public class Factorial {

	public static void main(String[] args) {
		
		int n;
		int factorial=1;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number to find the factorial");
		
		n=input.nextInt();
		
		for(int i=n;i>=1;i--) {
			
			factorial = factorial*i;
			//System.out.println(factorial);
		}
		
		System.out.println("Factorial of "+ n + " is "+ factorial);

	}

}
