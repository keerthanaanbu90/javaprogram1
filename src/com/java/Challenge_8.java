package com.java;

//import java.security.AccessControlContext;

public class Challenge_8 {
	
	public void Access() {
		
		this.m2();
		
	}
	public static void m1() {
		
		System.out.println("static method");
		
	}
	public void m2() {
		this.m1();
		System.out.println("non static method");
	
}
	public static void main(String[] args) {
		Challenge_8 ch=new Challenge_8();
		ch.Access();
		
	}
}
