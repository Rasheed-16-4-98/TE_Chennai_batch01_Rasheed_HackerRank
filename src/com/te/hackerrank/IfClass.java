package com.te.hackerrank;
import java.util.Scanner;
public class IfClass {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=scn.nextInt();
		if(num%2!=0)
			System.out.println("weird");
		else if(num%2==0||num>2&&num<5)
			System.out.println("Not a weird");
		else if(num%2==0||num>6&&num<20)
			System.out.println("weird");
		else if(num%2==0||num>25)
			System.out.println("Not a Weird");
	}

}
