package collectionExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		 // Creating object for a Map.  
        Map<String, Integer> map  = new HashMap<String,Integer>();  
  
        Map<Integer, String> map1  = new HashMap<Integer, String>();  
        // Adding Elements using Map.  
        map.put("Rajat", 101);  
        map.put("Shyam", 102);  
        map.put("Rahul", 103);  
        map.put("Krishna1", 105);  
        map.put("Krishna", 105);  
        // here, elements may traverse in any order  
        
        map1.put(101, "Mohan1");  
        map1.put(102, "Mohan2");  
        map1.put(103, "Mohan3");  
        map1.put(104, "Mohan4");  
        map1.put(104, "Mohan5");  
        map1.put(105, "Mohan5"); 
        
        int size = map1.size();
        System.out.println(size);
        
        System.out.println(map1.entrySet());
        
        //for (Entry<String, Integer> data : map.entrySet())  
        //    System.out.println(data);  
        
       // for (Map.Entry m : map.entrySet()) 
       // {  
       //     System.out.println(m.getKey() + " "  
         //                      + m.getValue());  

       // }
        
        for (Map.Entry m1 : map1.entrySet()) 
        {  
            System.out.println(m1.getKey() + " "  
                               + m1.getValue());  

        }

	}
	
}
