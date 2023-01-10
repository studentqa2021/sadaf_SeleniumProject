package com.sunday.pracricejava;

public class SwapVariable {
   
	
	int a=100;
	int b=50;
	
	public  void getData(){
		
	    System.out.println("Before swap a value=" +a );
	    System.out.println("Before swap value ="+b);
	    
	    a=a+b; //150
	    b=a-b;//100
	    a=a-b;//50
	
	System.out.println("After swap a value="+a);
	System.out.println("After swap b value="+b);
	}
	   
	
	
	
	public static void main(String[] args) {
		SwapVariable obj=new SwapVariable();
		obj.getData();
	}
}
