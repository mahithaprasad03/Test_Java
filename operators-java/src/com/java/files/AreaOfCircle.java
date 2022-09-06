package com.java.files;
//3)	WAP to find the area of a circle 


class Area{
	
	double pi=3.14;
	double r=10;
	double area() {
		double area= pi*r*r;
		return area;
	}
	
}

public class AreaOfCircle {

	public static void main(String[] args) {
		
		Area obj=new Area();
		double area=obj.area();
		System.out.println("area is "+ area);

	}

}
