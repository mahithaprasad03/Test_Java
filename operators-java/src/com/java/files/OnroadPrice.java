package com.java.files;

/*10)	WAP to print On-road price of the car, were it has 18.5% of road tax 

and 12.9% insurance of ex-showroom price of the car

*/

public class OnroadPrice {

	public static void main(String[] args) {
		
		double exshowroomPrice=20000; // in CAD
		
		double roadPrice;
		
		double roadTax= (18.5/100)*exshowroomPrice;
		
		double insurance = (12.9/100)*exshowroomPrice;
		
		roadPrice = exshowroomPrice+roadTax+insurance;
		
		System.out.println("Onroad price of the car is "+ roadPrice );
	}

}
