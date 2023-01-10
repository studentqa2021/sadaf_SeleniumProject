package com.oops.java;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapCode {


public static void main(String[] args) {
	//key and value salary:5000
	
	
	//specific object==>Array.a[index]
	//list=listname.get(index)
	Map<String,Integer>myMap=new HashMap<>();
	myMap.put("Salary",5000);
	myMap.put("Age", 20);
	myMap.put("Phnoe", 732318475);
	System.out.println(myMap.size());
	System.out.println(myMap.get("Salary"));
	
	
}
}