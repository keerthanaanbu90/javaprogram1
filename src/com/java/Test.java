package com.java;

public class Test {
		Test(){
			this(10,20);
			System.out.println("Bye");
		}
		Test(int x){
			System.out.println("hai");
		}
		Test(int x,int y){
			this(10);
			System.out.println("hello");
		}
		public static void main(String[] args) {
			Test t1=new Test();
			
		}
}
