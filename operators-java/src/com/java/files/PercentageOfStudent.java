package com.java.files;
//5)	WAP to find the percentage of a student

class Percentage{
	
	int total=300;
	
	void percent(int a,int b,int c) {
		
		double sum=a+b+c;
		
		double totalPercent= (sum/total) *100;
		
		//double per = (double)[{(a+b+c)/total}*100];
		
		System.out.println("Percentage is "+ totalPercent );
	}
}
public class PercentageOfStudent {

	public static void main(String[] args) {
	
			Percentage obj=new Percentage();
			obj.percent(60, 50, 80);
	}

}
