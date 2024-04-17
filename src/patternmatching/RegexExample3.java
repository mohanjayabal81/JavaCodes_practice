package patternmatching;

import java.util.regex.Pattern;  
import java.util.Scanner;  
import java.util.regex.Matcher;    
public class RegexExample3{    
    public static void main(String[] args){    
        Scanner sc=new Scanner(System.in);  
        while (true) {    
            System.out.println("Enter regex pattern:");  
            Pattern pattern = Pattern.compile(sc.nextLine()); 
            String s1 = pattern.toString();  
            String s2 = "null";
            System.out.println(pattern);
            System.out.println(s1);
            if(s1==s2)            	
            {
            	System.exit(0);  
            }
            else
            {
            	
            	System.out.println("Enter text:");  
                Matcher matcher = pattern.matcher(sc.nextLine());    
                boolean found = false;    
                while (matcher.find()) {    
                    System.out.println("I found the text "+matcher.group()+" starting at index "+    
                     matcher.start()+" and ending at index "+matcher.end());    
                    found = true;   
                    
                    if(!found){    
                        System.out.println("No match found.");    
                    }    
                }    
                
            	
            }
            
           
        }    
    }    
}    
