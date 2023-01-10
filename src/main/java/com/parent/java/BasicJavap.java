package com.parent.java;

import java.util.Arrays;

public class BasicJavap {
   
   static int[] employeeAge = {10,20,30,40,50,60,70};//end index=5,number=6
   
   public static void main(String[] args) {//start main method
	//basic for loop with Array==>code is hard &performance slow
	  for(int i=0;i<employeeAge.length;i++) {
		if( employeeAge[i]>65) {
			System.out.println("He is a senior citizen");
			
		}  
	  } 
	   
	   
	   
	   
	   
	   //new loop==>enhance for loop 
	  //for(datatype anyName:ArrayName)
	  
	   
	   for(int age:employeeAge) {
		System.out.println(age);
		     if(age>65) {
			System.out.println("He is senior citizen");
		}
	}
	
	Arrays.stream(employeeAge).forEach(age->{
		
		
		System.out.println(age);
		
		
			});
	
	
	
	
	   }
}

