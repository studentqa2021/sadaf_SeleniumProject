package com.oops.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetCode {
	
	public static void main(String[] args) {
		List<String>myList=new ArrayList<>();
		myList.add("sadaf");
		myList.forEach(value->{
			System.out.println(value);
		});
		for(int i=0;i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		
	//  Set<String>mySet=new HashSet<>();
	 // mySet.add(null);
	 /// mySet.add();
	for(String value:myList) {
		System.out.println(value);
	}
	
	
 
	
	
	
	
	
	
	}
	}
