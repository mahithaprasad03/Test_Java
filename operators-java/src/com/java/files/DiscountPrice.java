package com.java.files;
import java.util.Scanner;

public class DiscountPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the price");
		double price=input.nextDouble();
		System.out.println("Enter the percentage of discount provided");
		double percentage=input.nextDouble();
		double discount=(percentage/100)*price;
		double FinalPrice=price-discount;
		System.out.println("Final price after discount is "+FinalPrice);
		

	}

}
