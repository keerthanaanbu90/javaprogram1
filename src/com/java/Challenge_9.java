package com.java;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Challenge_9   {
	public static void main(String[] args) {
		
		String str="java class...";
		String res="";
		Set <Character> s=new LinkedHashSet<>();
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			s.add(ch);
			
			
		}
		for (Character character : s) {
			res=res+character;
			
			
		}
		
		System.out.println(res);
		System.out.println(s);
		
		
	}
	
			
	
}
	
