package com.java.files;
abstract class Van {
	int cost;
	double size;
	void move() {
		System.out.println("I am move() method");
	}
	void changeGear() {
		System.out.println(" I am Gear() method");
	}
	abstract void turn();
	abstract void music();
}

class car1 extends Van{
	void turn() {
		
	}
	void music() {
		
	}
	
	
}
public class Car {
	public static void main() {
		
	}

}
