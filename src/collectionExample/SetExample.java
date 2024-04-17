package collectionExample;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		 // Set demonstration via using HashSet  
        Set<String> Set = new  HashSet<String>();  
  
        // Adding some Elements   
   
        Set.add("Machine Learning");  
        Set.add("Python");  
        Set.add("DBMS");  
        Set.add("Machine Learning");  
        Set.add("Operating System");  
        Set.add("Operating System");  
        Set.add("Java");  
        
        
        
        for (String cars : Set)  
            System.out.println(cars);  
  
        // Here Set follows unordered way.  
        System.out.println(Set);  

	}

}
