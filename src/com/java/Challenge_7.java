package com.java;

public class Challenge_7 {
	

	public static void main(String[] args) {
		int num=98765;
		
		int rev=1;
		int rem=0;
		int n  =num;
		 
		while(num>0) {
			rem=num % 10;
			rev=rev  * rem;
			 
			num=num/10;
		}
	
		System.out.println("product of digits given number " + n + " : " + rev );
	}
	
}
