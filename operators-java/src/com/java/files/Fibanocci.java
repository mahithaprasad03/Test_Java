package com.java.files;
import java.util.Scanner;

//28)	WAP to find the fibonacci series of given number 

public class Fibanocci {

	public static void main(String[] args) {
		
		int n;
		int num1=0;
		int num2=1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of numbers to find the fibanocci series ");
		
		n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			System.out.print(num1+" ");
	
			int num3= num2+num1;
			num1=num2;
			num2=num3;
			
			
		}
		
	}

}
