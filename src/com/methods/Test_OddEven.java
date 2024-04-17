package com.methods;

public class Test_OddEven {

	public static void main(String[] args) 
	{
		OddEven obj = new OddEven();
		//obj.findEvenOdd(5);
		OddEven.findEvenOdd(5);
		
		OddEven.name = "Mohan";
		System.out.println(OddEven.name);
		obj.name = "Ram";
		System.out.println(obj.name);

	}

}
