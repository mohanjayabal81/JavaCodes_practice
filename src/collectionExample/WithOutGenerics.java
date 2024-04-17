package collectionExample;

//The Java Generics programming is introduced in J2SE 5 to deal with type-safe objects. 
//It makes the code stable by detecting the bugs at compile time.

//Before generics, we can store any type of objects in the collection, 
//i.e., non-generic. Now generics force the java programmer to store a specific type of objects.

import java.util.ArrayList;
import java.util.List;

// Without Generics, we can store any type of objects.
public class WithOutGenerics {

	public static void main(String[] args) 
	{
		List list = new ArrayList();    
		list.add(10);  
		list.add("Mohan"); 
		
		int n = (int) list.get(0);
		 
		System.out.println(n);
		
		String s = (String) list.get(1);
		System.out.println(s);
		
		
		
		 

	}

}
