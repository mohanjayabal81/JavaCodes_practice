package operators;

import source.ConOpr;

 class Class1
{
	 
	   static class Class3
	 {
	 	 void method1()
	 		{
	 			System.out.println("Inner Class 3 method 1");
	 		}
	 	
	 }
	void method1()
	{
		System.out.println("Method1 OuterClass1");
	}
}
 
 class Class2
{
	 void method1()
		{
			System.out.println("Method1 Class2");
		}
}
 
 class Class4
{
	 void method1()
		{
			System.out.println("Method1 Class4");
		}
	
}
 
 

public class ConditionalOpr {
	
	 

	public static void main(String[] args)
	{
		int a = 10, b = 20;  
		
		ConOpr obj = new ConOpr();
	    obj.performConOprAdd(a, b);
	    obj.performConOprSub(a, b);
	    obj.performConOprMul(a, b);
	    obj.performConDiv(a, b);
	    
	    Class1 obj1 = new Class1();
	    
	    Class1 obj5 =  new Class1();
	    obj5.method1();
	    
	    operators.Class1.Class3 obj6 = new operators.Class1.Class3();
	    obj6.method1();
	  

	}

}
