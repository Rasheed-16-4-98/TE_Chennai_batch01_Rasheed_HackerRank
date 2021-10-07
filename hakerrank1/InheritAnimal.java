package com.te.hakerrank1;

public class InheritAnimal {
 
	void walking(){
        System.out.println("Iam Walking");
    }
}
class Bird extends InheritAnimal{
	void fly(){
		System.out.println("I am flying");
	}
    void sing() {
    	System.out.println("iam singing");
    }
}