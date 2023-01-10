package com.generic;

public class Employee {

	static String name = "saifu";
	int salary = 5000;

	static void name() {
		System.out.println(name);

	}

	void salary() {
		System.out.println(salary);

	}

	public static void main(String[] args) {

		Employee.name();
		Employee obj = new Employee();
		obj.salary();

	}
}
