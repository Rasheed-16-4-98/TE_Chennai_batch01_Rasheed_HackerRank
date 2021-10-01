package com.te.hackerrank;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String str="MADAM";
		char[] ch=str.toCharArray();
		str=" ";
		for(int i=ch.length-1;i>=0;i--) {
			
			str=str+ch[i];
			
		}
		System.out.println("String Reverse  :  "+str);
			
	}

}
