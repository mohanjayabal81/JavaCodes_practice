package swithcexamples;

//Java Program to demonstrate the use of Java Switch  
//statement with String  
public class SwitchStringExample 
{    
	public static void main(String[] args) 
	{    
		//Declaring String variable  
		String levelString="Expert1";  
		int level=0;  
		//Using String in Switch expression  
		switch(levelString){    
		//Using String Literal in Switch case  
		default: level=0;  
		break;
		case "Beginner": level=1;  
		break;    
		case "Intermediate": level=2;  
		break;    
		case "Expert": level=3;  
		break;    
		  
		}    
		System.out.println("Your Level is: "+level);  
	}    
}   
