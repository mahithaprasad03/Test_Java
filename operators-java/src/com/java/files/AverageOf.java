package com.java.files;
import java.util.Scanner;

//2)	WAP to find the average of three integer numbers



class Average{
	
	void averageOfThree(double a,double b,double c) {
		
		double avg = (a+b+c)/3;
		System.out.println("Average of 3 is "+avg);
		
	}
}
public class AverageOf {

	public static void main(String[] args) {
	
		Average avg = new Average();

		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number to calculate average "+'\n');
		double a=input.nextDouble();
		System.out.println("Enter second number to calculate average "+'\n');
		double b=input.nextDouble();
		System.out.println("Enter third number to calculate average "+'\n');
		double c=input.nextDouble();
		avg.averageOfThree(a, b, c);

	}

}
