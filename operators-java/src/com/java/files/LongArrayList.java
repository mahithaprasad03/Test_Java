package com.java.files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LongArrayList {

	public static void main(String[] args) {
		
		ArrayList<Long> al=new ArrayList<Long>();
		
		al.add(105L);
		al.add(10L);
		al.add(20L);
		al.add(30L);
		
		System.out.println("-----------for loop-------");
		
		for(int i=0;i<al.size();i++) {
			
			Object r= al.get(i);
			System.out.println(r);
		}
		
		System.out.println("-----------for each loop-------");
		
		for(Object r: al) {
			System.out.println(r);
		}
		
		System.out.println("-------------Iterator---------");
		
		Iterator it= al.iterator();
		
		while(it.hasNext()) {
			
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("-------------ListIterator---------");
		
		ListIterator lit= al.listIterator();
		
		while(lit.hasNext()) {
			
			Object r= lit.next();
			System.out.println(r);
		}


	}

}
