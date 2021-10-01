package com.te.hackerrank;

import java.util.Scanner;

public class ForLoop {
	
	public void loop() {
		 
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter The Number");
		int num=scn.nextInt();
		for(int i=1;i<=10;i++) {
			
			int multiply=num*i;
			System.out.println(num+" X "+i+" = "+multiply);
			
		}
		
		
	}

}
