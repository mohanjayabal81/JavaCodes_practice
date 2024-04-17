package com.constructor.examples;

public class MyConstructor {
	String name;
	
	MyConstructor() // Default Constructor
	{
		System.out.println("This is my Constructor...");
	}
	
	MyConstructor(String name) // Default Constructor
	{
		this.name = name;
		name = "Mohan1";
		System.out.println("This is my Constructor..."+name);
		System.out.println("This is my Constructor..."+this.name);
		
	}
	
	MyConstructor(String name,int rollno) // Default Constructor
	{
		
		System.out.println("This is my Constructor..."+name);
		System.out.println("This is my Constructor..."+rollno);
		
	}
	
	
	void Myconstructor()
	{
		System.out.println("This is my method...");
	}
	
}
