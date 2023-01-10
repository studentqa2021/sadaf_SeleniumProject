package com.oops.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PracticeArrayList {
  
	
	
	public static void main(String[] args) {
		List<String> myList=new ArrayList<>();
		myList.add("sadaf");
		myList.add("Ashfaq");
		myList.add("SmartTech");
		
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
		//enhance loop or foreach loop for set no basic loop 
		//because set has no get method
		Set<Integer>myList2=new HashSet<>();
		myList.add("imran");
		myList.add("Piracha");
		for(Integer value:myList2 ){
			System.out.println(value);
		}
		myList2.forEach(System.out::println);
	}
}
