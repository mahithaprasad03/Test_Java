package com.java.files;
import java.util.Scanner;

//24)	WAP to print the prime numbers in the given range

public class PrimeInRange {

	public static void main(String[] args) {
		
		int m,n;
		int flag=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting range");
		
		m=input.nextInt();
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter the ending range");
		
		n= input1.nextInt();
		
		for(int i=m;i<=n;i++) {
			
			 int k=i/2;      
			  if(i==0||i==1){  
			   //System.out.println(i+" is not prime number");      
			  }else{  
			   for(int j=2;j<=k;j++){      
			    if(i%j==0){      
			    // System.out.println(i+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
			   }      
			   if(flag==0)  { System.out.println(i); }  
			  }//end of else  
		}
		
		
		
		
		

	}

}
