package com.java.files;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoubleLinkList {

	public static void main(String[] args) {

		LinkedList<Double> link= new LinkedList<Double> ();
		link.add(30.5);
		link.add(20.56);
		link.add(10.5);
		
		System.out.println("-----------for loop-------");
		
		for(int i=0;i<link.size();i++) {
			
			Object r= link.get(i);
			System.out.println(r);
		}
		
		System.out.println("-----------for each loop-------");
		
		for(Object r: link) {
			System.out.println(r);
		}
		
		System.out.println("-------------Iterator---------");
		
		Iterator it= link.iterator();
		
		while(it.hasNext()) {
			
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("-------------ListIterator---------");
		
		ListIterator lit= link.listIterator();
		
		while(lit.hasNext()) {
			
			Object r= lit.next();
			System.out.println(r);
		}
	}

}
