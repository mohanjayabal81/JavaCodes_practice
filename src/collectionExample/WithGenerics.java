package collectionExample;

import java.util.ArrayList;
import java.util.List;
// Type casting is not required: There is no need to typecast the object.
public class WithGenerics {

	public static void main(String[] args) {
		//With Generics, it is required to specify the type of object we need to store.  
		List<Integer> list = new ArrayList<Integer>();    
		list.add(10);  
		//list.add("10");// compile-time error  
		
		List<String> list1 = new ArrayList<String>();    
		list1.add("hello");    
		String s = list1.get(0);   
		System.out.println(s);

	}

}
