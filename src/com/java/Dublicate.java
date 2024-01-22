package com.java;

public class Dublicate {
	public static void main(String[] args) {
		int a[]= {10,10,20,50,60,80,60,50};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					for(int k=j;k<a.length;k++) {
						a[k]=a[k+1];
						
					}
                      j--;
					
					
				}
				
			}
			System.out.println(i);
		}

	}

}
