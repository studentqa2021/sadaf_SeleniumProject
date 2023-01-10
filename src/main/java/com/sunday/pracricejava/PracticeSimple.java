package com.sunday.pracricejava;

public class PracticeSimple {
   
	//int a=10;
	//int b=20;
	//swap variable value
	public void getSalary(int a,int b) {
		System.out.println("Before swap a value="+a);
	    System.out.println("Before swap a value="+b);
	
	a=a+b;//30
	System.out.println("Current a value="+a);
	b=a-b;//10
	System.out.println("After swap b value="+b);
	a=a-b;//20
	System.out.println("After  swap a value="+a);		
	
	
	
	}


public static void main(String[] args) {
	PracticeSimple obj=new PracticeSimple();
	obj.getSalary(10,20);
     



}



}
