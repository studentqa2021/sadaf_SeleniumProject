package com.sunday.pracricejava;


public class IfElseCode {

	
	
	public void getJavaCondtion(int age ){
		
		if(age<1) {
			System.out.println("This is baby");
			
			
		}else if(age<10&& age>2) {
			System.out.println("This is kids");
		
		}else if(age<18&& age<65){
			System.out.println("This is Adult");
		}else if(age>65) {
			System.out.println("This is adult");
		}else {
			System.out.println("Age not found");
			}
	
				
			}
			

		public static void main(String[] args) {
			IfElseCode obj=new IfElseCode();
			obj.getJavaCondtion(9);
		}
		
		
	}

