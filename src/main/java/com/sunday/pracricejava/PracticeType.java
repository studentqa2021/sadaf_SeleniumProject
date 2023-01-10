package com.sunday.pracricejava;

public class PracticeType {
   
	
	
public	void getData(String name){
		
	for(int i=0;i<name.length();i++   ) {
		System.out.println(name.charAt(i));
		}
		StringBuilder obj2=new StringBuilder(name);
		System.out.println(obj2.reverse());
	
		
		
	}
	public static void main(String[] args) {
		PracticeType obj=new PracticeType();
		obj.getData("Sadaf");
	}
}
