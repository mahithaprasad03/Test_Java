package com.java.files;
import java.util.Scanner;

//26)	WAP to find the product of n numbers

public class ProductOfN {

	public static void main(String[] args) {
		
		int num=1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of numbers you want to multiply");
		
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
		
		Scanner input1= new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num2 = input1.nextInt();
		
		num= num*num2;
		
		}
		
		System.out.println("Product of "+n+ " given numbers is " + num);

		

	}

}
