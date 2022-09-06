package com.java.files;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value of p"+"\n");
		double p=input.nextDouble();
		System.out.println("Enter the value of n"+"\n");
		double n=input.nextDouble();
		System.out.println("Enter the value of r"+"\n");
		double r=input.nextDouble();
		double SI=(p*n*r)/100;
		System.out.println("Simple interest is "+SI);
		

	}

}
