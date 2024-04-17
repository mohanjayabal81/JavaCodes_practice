package collectionExample;

import java.util.ArrayList;
import java.util.List;

//List vs Set vs Map in Java

public class ListExample {

	public static void main(String[] args) {
	    // here create a List  
        List<String> al = new ArrayList<String>();  
        
        ArrayList<String> obj = new ArrayList<String>();
  
        // Now add the elements in the List  
        al.add("BMW");  
        al.add("Hundai");  
        al.add("Toyota");  
        al.add("Swift");  
        al.add("Swift");  
  
        // Iterating the List  
        // element using for-each loop  
        for (String cars : al)  
            System.out.println(cars);  
	}

}
