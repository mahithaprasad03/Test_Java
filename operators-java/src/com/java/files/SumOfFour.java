package com.java.files;
import java.util.Scanner;

class Calculate{
	
	int sum;
	int sumOfFour(int a,int b,int c,int d) {
		
		sum=a+b+c+d;
		
		return sum;
	}
	
	
}
public class SumOfFour {

	public static void main(String[] args) {
		
		Calculate obj= new Calculate();
		System.out.println("Enter 4 numbers to add");
		Scanner input1=new Scanner(System.in);
		int a=input1.nextInt();
		Scanner input2=new Scanner(System.in);
		int b=input2.nextInt();
		Scanner input3=new Scanner(System.in);
		int c=input3.nextInt();
		Scanner input4=new Scanner(System.in);
		int d=input4.nextInt();
		int sum=obj.sumOfFour(a, b, c, d);
		System.out.println("Sum of 4 given numbers is " + sum);
		
	
		
	}

}
