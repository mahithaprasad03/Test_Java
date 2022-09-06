package com.java.files;
//4)	WAP to find circumference of a circle

class Circumference{
	
	void circum(double pi,double r) {
		
		double result=2*pi*r;
		System.out.println("Circumference of circle is "+ result);
	}
}


public class CircumferenceOfCircle {

	public static void main(String[] args) {
		
		Circumference obj=new Circumference();
		obj.circum(3.14, 10);

	}

}
