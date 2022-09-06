package com.java.files;
import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		
		int num;
		int count =0;
		
		Scanner input =new Scanner(System.in);
		System.out.println("Enter a number to count the digit");
		
		num=input.nextInt();
		
		while(num!=0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);

	}

}
