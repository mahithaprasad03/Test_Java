package com.java.files;

public class ReverseOddPosition {

	public static void main(String[] args) {
		
		String str= "Welcome to Canadian Job Market";
		String reverse="";
		String nonReverse="";
		char ch;
		char rch;
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
	        ch= str.charAt(i);
	        nonReverse=nonReverse+ch;
	      //  System.out.println("nonReverse= "+nonReverse);
	        if(ch==' '||i==str.length()-1) {
	        	count++;
	        	//System.out.println(count);
	        	if(count%2!=0) {
	    	       for(int j=0;j<nonReverse.length();j++) {
	    	    	   rch= nonReverse.charAt(j);
	    	    	   reverse=rch+reverse;
	    		}
	    	       nonReverse=reverse;
	    	   	System.out.print(nonReverse);
	    	   	nonReverse="";
	    	    reverse="";
	        }
	        	else {
	        		System.out.print(" "+nonReverse);
	        		nonReverse="";
	        	}
	        }	

	}
		//System.out.println(count);
}

}