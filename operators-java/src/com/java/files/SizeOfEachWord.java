package com.java.files;

public class SizeOfEachWord {

	public static void main(String[] args) {
		
		String str= "Welcome to the wide world of nature";
		String str1="";
		int count=0;
		char ch;
		int length=str.length();
		System.out.println(length);
		
		for(int i=0; i<length;i++) {
			
			ch=str.charAt(i);
			str1=str1+ch;
			if(ch!=' ') {
					count++;			
			}
			else
			{
				System.out.print(str1+count+" ");
				str1="";
				count=0;
			}
		}
		System.out.print(str1+count+" ");

	}

}
