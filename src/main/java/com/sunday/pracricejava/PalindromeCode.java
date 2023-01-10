package com.sunday.pracricejava;

public class PalindromeCode {
	
	 public void  getData(String myname){
		 
		 StringBuffer obj =new StringBuffer(myname);
		 System.out.println("Before Reverse="+ myname);
	   String reversename=obj.reverse().toString();
	   System.out.println("After Reverse"+reversename);
	   if(myname.equals(reversename)) {
		   System.out.println("This is palindrome");
		   }
	   else {
		   
		  System.out.println("This is not palinddrome"); 
	   }
	   
 }
	 public static void main(String[] args) {
	PalindromeCode  obj=new PalindromeCode ();
	
	obj.getData("PAPA");
	
}
}
