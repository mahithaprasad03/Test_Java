package com.java.files;
import java.util.Scanner;

public class BmiCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the weight"+'\n');
		double w=input.nextDouble();
		System.out.println("Enter the height in meters"+'\n');
		double h=input.nextDouble();
		double bmi=w/(h*h);
		System.out.println("Your BMI is "+bmi);
		
		

	}

}
