package com.java.files;
import java.util.Scanner;

class TaxCalculator{
	
	double serviceTax(double grossValue, double percent) {
		
		double serviceTaxAmount= grossValue*(percent/100);
		
		return serviceTaxAmount;		
		
	}
	
}
public class ServiceTax {

	public static void main(String[] args) {
		
		System.out.println("Enter the gross amount");
		Scanner input=new Scanner(System.in);
		double grossValue= input.nextDouble();
		System.out.println("Enter the percentage of service tax");
		Scanner input1=new Scanner(System.in);
		double percent= input1.nextDouble();
		
		TaxCalculator obj=new TaxCalculator();
		System.out.println(obj);
		double TaxAmount=obj.serviceTax(grossValue, percent);
		System.out.println("Service Tax Amount is "+ TaxAmount);
		
		

	}

}
