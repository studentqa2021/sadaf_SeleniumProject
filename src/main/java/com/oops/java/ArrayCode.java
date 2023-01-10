package com.oops.java;

import java.util.Arrays;

public class ArrayCode {
     static int b=5;
    static int[] a= {10,20,30};
     //print Array =Arrays.toString(a)
    //1st position =a[0]
    //number count=(a.length);
    //loop an Array=for(int i=0;i<end point;i++)
     
     public static void main(String[] args) {
		System.out.println(b);//variable
		//printing issuer==>Arrays.toString(arrayName)
		System.out.println(Arrays.toString(a));
		//ist position 
		System.out.println(a[0]);//10==>2
		//3rd position 
		System.out.println(a[3]);
		//4th position 
		//System.out.println(a[4]);
	
	//total length
	//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
}
}