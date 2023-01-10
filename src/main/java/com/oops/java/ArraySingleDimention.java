package com.oops.java;

import java.util.Arrays;

public class ArraySingleDimention {
static int[] a= {10,20,30};


public static void main(String[] args) {
	


//basic loop
	for( int i=0;i <a.length;i++) {
		
	}
//enhance for loop
	//datatype anyname:arry/collection name
	for(int value:a) {
		System.out.println(value);
		
	}
	//latest for loop=foreach loop==>collection(also u can try for array)
	//array/collection name.foreach(v->{syso }
	
	
	Arrays.stream(a).forEach(value->{
		
		
		System.out.println(value);
	});
} 
	
	
}
	






