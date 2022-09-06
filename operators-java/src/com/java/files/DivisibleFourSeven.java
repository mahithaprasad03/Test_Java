package com.java.files;
import java.util.Scanner;

//15)	WAP to find if the given number is divisible by both 4 and 7
public class DivisibleFourSeven {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number to check divisibility by 4 and 7");
		
		n=input.nextInt();
		
		if(n%4==0 && n%7==0) {
			
			System.out.println(n + " is divisible by 4 and 7");
		}
		
		else if(n%4==0) {
			
			System.out.println(n + " is divisible by 4 but not by 7");
		}
		
		else if(n%7==0) {
			
			System.out.println(n +" is divisible 7 but not by 4");
		}
		else {
			System.out.println(n + " is not divisible by 4 and 7");
		}
		
	}

}
