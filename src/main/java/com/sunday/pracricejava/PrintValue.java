package com.sunday.pracricejava;


public class PrintValue {
 //print 0 to 100 // for loop(start number and 
	//end number,positive or negative)
 ///formula for(start;end;++){}

 public void getData( ){
	 for(int i=0;i<=100;i++) {
	System.out.println(i); 
 }
	 
	 
	 //negative loop(end;start;i--)
	 for( int i=100;i>=0;i--) {
	 System.out.println(i);	 
	 }
	 
	 }
	 
	
	 
	
 

public static void main(String[] args) {
	PrintValue obj=new PrintValue();
	obj.getData();

}



}
