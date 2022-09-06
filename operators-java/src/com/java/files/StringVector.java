package com.java.files;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class StringVector {

	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String> ();
		
		v.add("priya");
		v.add("Mahitha");
		v.add("ravi");
		v.add("prabhu");
		v.add("aaradhana");
		v.add("kiara");
		
System.out.println("-----------for loop-------");
		
		for(int i=0;i<v.size();i++) {
			
			Object r= v.get(i);
			System.out.println(r);
		}
		
		System.out.println("-----------for each loop-------");
		
		for(Object r: v) {
			System.out.println(r);
		}
		
		System.out.println("-------------Iterator---------");
		
		Iterator it= v.iterator();
		
		while(it.hasNext()) {
			
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("-------------ListIterator---------");
		
		ListIterator lit= v.listIterator();
		
		while(lit.hasNext()) {
			
			Object r= lit.next();
			System.out.println(r);
		}


	}

}
