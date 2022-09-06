package com.java.files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestCollection {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(50);
		al.add(60.5);
		al.add("Arraylist");
		
		LinkedList link= new LinkedList();
		
		link.add(10);
		link.add("Linkedlist");
		link.add(10.5);
		
		Vector v=new Vector();
		
		v.add(20);
		v.add("vector");
		v.add(20.5);
		
		for(int i=0;i<al.size();i++) {
			
			Object obj= al.get(i);
			System.out.println(obj);
		}
		for(Object ob: al) {
			System.out.println(ob);
		}
		
		Iterator it= al.iterator();
		
		System.out.println("-----Iterator----------");
		
		while(it.hasNext()) {
			Object r=it.next();
			System.out.println(r);
		}
		
		System.out.println("-----ListIterator----------");
		
		ListIterator li= al.listIterator();
		
		while(li.hasNext()) {
			
			Object obj=li.next();
			
			System.out.println(obj);
		}
		
		System.out.println("-----LinkedList-----");
		
for(int i=0;i<link.size();i++) {
			
			Object obj= link.get(i);
			System.out.println(obj);
		}
		for(Object ob: link) {
			System.out.println(ob);
		}
		
		Iterator linkIt= link.iterator();
		
		System.out.println("-----LinkedList Iterator----------");
		
		while(linkIt.hasNext()) {
			Object r=linkIt.next();
			System.out.println(r);
		}
		
		System.out.println("-----LinkedList ListIterator----------");
		
		ListIterator linkLi= link.listIterator();
		
		while(linkLi.hasNext()) {
			
			Object obj=linkLi.next();
			
			System.out.println(obj);
		}
		
		System.out.println("-----Vector-----");
		
		for(int i=0;i<v.size();i++) {
					
					Object obj= v.get(i);
					System.out.println(obj);
				}
				for(Object ob: v) {
					System.out.println(ob);
				}
				
				Iterator vit= v.iterator();
				
				System.out.println("-----Vector Iterator----------");
				
				while(vit.hasNext()) {
					Object r=vit.next();
					System.out.println(r);
				}
				
				System.out.println("-----Vector ListIterator----------");
				
				ListIterator vli= v.listIterator();
				
				while(vli.hasNext()) {
					
					Object obj=vli.next();
					
					System.out.println(obj);
				}


	}

}
