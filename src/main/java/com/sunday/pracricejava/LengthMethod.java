package com.sunday.pracricejava;

public class LengthMethod {

	;//loop of the string
	
	String name="sadaf piracha";
	
	public void getname() {
		//System.out.println(name.length());
	//for(int i=0;i<=name.length()-1;i++) {
		//System.out.print(name.charAt(i));
	//}
	for(int i=name.length()-1;i>=0;i--) {
		System.err.println(name.charAt(i));
	}
	}

public static void main(String[] args) {
	LengthMethod obj=new LengthMethod();
	obj.getname();


}
}
