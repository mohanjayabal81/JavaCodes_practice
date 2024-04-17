package overloading;

import abstractionexample.Honda;

public class TestEngine {

	public static void main(String[] args) 
	{
		 
      Bike obj = new Honda();
      obj.enginerun();
      
      
      Bike obj1 = new Suzuki();
      obj1.enginerun();
      
	}

}
