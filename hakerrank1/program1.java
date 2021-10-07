package com.te.hakerrank1;

import java.util.Scanner;

public class program1 {

	public static void scanner() {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the Integer Value");
		int num = scn.nextInt();
		System.out.println("Enter the Double Value");
		double val = scn.nextDouble();
		System.out.println("Enter The String");
		String str = scn.next();

		System.out.println("String: " + str);
		System.out.println("Double: " + val);
		System.out.println("Int: " + num);
	}
}
