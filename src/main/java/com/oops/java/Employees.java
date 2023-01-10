package com.oops.java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Employees {
	//1st way to declare list
static	List<Integer> myArrayList = new ArrayList<>();
//add 10,20
   
   
	static List<Integer> myLinkedList = new LinkedList<>();
	
    
	
	
public static void main(String[] args) {
	myArrayList.add(10);
	myArrayList.add(20);
	myArrayList.add(30);
	System.out.println("Array List="+myArrayList);
	
	
	
	myArrayList.add(10);
	myArrayList.add(20);
	myArrayList.add(30);
	System.out.println("Array List="+myArrayList);
}
}

