package com.java.files;
import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		
		
		double percentage;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the scored percentage to display your grade");
		
		percentage = input.nextDouble();
				
		if(percentage<40) {
			
			System.out.println("Your Grade is F and you failed");			
		}
		
		else if(percentage>=40 && percentage<50 ) {
			
			System.out.println("Your Grade is C");
		}
		else if(percentage>=50 && percentage<60) {
			
			System.out.println("Your Grade is B");
		}
		else if(percentage>=60 && percentage<75) {
			
			System.out.println("Your Grade is A");
		}
		else{
			
			System.out.println("Your Grade is O");
		}
	}

}
