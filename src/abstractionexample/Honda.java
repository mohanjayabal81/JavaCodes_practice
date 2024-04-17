package abstractionexample;

import overloading.Bike;
import overloading.Suzuki;

public class Honda  extends Bike
	{  
	 
	
	

 
	public void enginerun() {
		System.out.println("Honda Engine is running..");
		
	}
	
	public static void main(String[] args)
	{
		
		Honda b = new Honda();
		b.enginerun();
	}

	 
	}  
	
