package com.java.files;

public class LargestofThree {

	public static void main(String[] args) {
		
		int a=20,b=10,c=8;
		
		if (a>b) {
			
			if(a>c) {
				
				System.out.println("a is largest and a="+a);
			}
			else
			{
				System.out.println("c is largest and c="+c);
			}
		}
		else if(b>c) {
			
			System.out.println("b is largest and b="+b);
		}
		else
		{
			System.out.println("c is largest and c="+c);
		}
		
		/*---------------------------------------------------------*/
		
if(a>b&&a>c){
			
			System.out.println("a is largest and a="+a);
		}
else if(b>a&&b>c){
	
	System.out.println("b is largest and b="+b);
}

else if(c>a&&c>b)
{
	System.out.println("c is largest and c="+c);
}	
else {
	
	System.out.println("numbers are same");
}

/*-------------------------------------------------*/

 int temp = a>b?a:b;
 
 int largest= c>temp?c:temp;
 
 System.out.println("Largest number is "+largest);

	}

}
