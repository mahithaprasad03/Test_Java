package com.java.files;
import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number to calculate average "+'\n');
		double a=input.nextDouble();
		System.out.println("Enter second number to calculate average "+'\n');
		double b=input.nextDouble();
		System.out.println("Enter third number to calculate average "+'\n');
		double c=input.nextDouble();
		double average=a+b+c;
		System.out.println("Average of three numbers is "+average);
		

	}

}
