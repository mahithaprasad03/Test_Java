package com.java.files;
import java.util.Scanner;

//13)	WAP to print if the number is odd or even

public class OddorEven {

	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		Scanner input= new Scanner(System.in);
		
		int num=input.nextInt();
		int res=num%2;
		
		if(res==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}

	}

}
