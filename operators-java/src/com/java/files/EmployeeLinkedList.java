package com.java.files;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeLinkedList {

	public static void main(String[] args) {
		
	
		
		LinkedList<Employee> li=new LinkedList<Employee>();
		
		Employee obj1= new Employee(1, "priya","IT");
		Employee obj2= new Employee(2, "Mahitha", "HR");
		Employee obj3 = new Employee(3, "kavitha", "Admin");
		
		li.add(obj1);
		li.add(obj2);
		li.add(obj3);
		
		System.out.println("-----------for loop-------");
		
		for(int i=0;i<li.size();i++) {
			
			Employee r= li.get(i);
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.department);
		}
		
		System.out.println("-----------for each loop-------");
		
		for(Employee r: li) {
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.department);
		}
		
		System.out.println("-------------Iterator---------");
		
		Iterator<Employee> it= li.iterator();
		
		while(it.hasNext()) {
			
			Employee r= it.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.department);
		}
		
		System.out.println("-------------ListIterator---------");
		
		ListIterator<Employee> lit= li.listIterator();
		
		while(lit.hasNext()) {
			
			Employee r= lit.next();
			System.out.println(r.id);
			System.out.println(r.name);
			System.out.println(r.department);
		}

	}

}
