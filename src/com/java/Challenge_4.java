package com.java;

import java.util.Random;

public class Challenge_4 {
	public static void main(String[] args) {
		
	
	Random r1=new Random();
	for(int i=1;i<=20;i++) {
		int x = r1.nextInt(200);
		if(x>=100) {
			i++;
			System.out.println(x);
		}
	
	}
	
	}
	
}
