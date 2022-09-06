package com.java.files;
import java.util.Scanner;

//29)	WAP to reverse the given number

public class ReverseNumber {

	public static void main(String[] args) {
		
		int n;
		int reversed=0;
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number to reverse");
		
		n=input.nextInt();
		
		while(n != 0) {
		    
		      // get last digit from num
		      int digit = n % 10;
		      reversed = reversed * 10 + digit;

		      // remove the last digit from num
		      n /= 10;
		    }
		

	    System.out.println("Reversed Number: " + reversed);	

	}

}
