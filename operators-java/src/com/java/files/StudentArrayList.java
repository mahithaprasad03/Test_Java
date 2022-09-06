package com.java.files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s1= new Student(1,"ravi",90.4);
		Student s2= new Student(2,"rahman",60.5);
		Student s3= new Student(3,"ricky",40.8);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
System.out.println("-----------for loop-------");
		
		for(int i=0;i<al.size();i++) {
			
			Student r= al.get(i);
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
		}
		
		System.out.println("-----------for each loop-------");
		
		for(Student r: al) {
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
		}
		
		System.out.println("-------------Iterator---------");
		
		Iterator<Student> it= al.iterator();
		
		while(it.hasNext()) {
			
			Student r= it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
		}
		
		System.out.println("-------------ListIterator---------");
		
		ListIterator<Student> lit= al.listIterator();
		
		while(lit.hasNext()) {
			
			Student r= lit.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.percentage);
		}
	}

}
