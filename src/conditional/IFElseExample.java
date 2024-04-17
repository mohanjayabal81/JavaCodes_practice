package conditional;

public class IFElseExample 
{

	public static void main(String[] args)
	{


		String city = "Delhi";  

		if(city == "Meerut")
		{  
			System.out.println("city is meerut");  
		}
		else if (city == "Noida") 
		{  
			System.out.println("city is noida");  
		}
		else if(city == "Agra")
		{  
			System.out.println("city is agra");  
		}
		else 
		{  
			System.out.println("The Condition are not True So the City Value is.."+city);  
		}  

	}  


}


