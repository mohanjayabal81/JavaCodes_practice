package classexample;

 
	
	public class Dog1
	{
		static String color = "Black";
		static String breed = "PoM";
		static String name = "Jacky";
		
		public static void barking()
		{
			System.out.println("Dog is barking"+color+breed+name);
		}
		
		public static void waggingTail()
		{
			System.out.println("Dog is waggingTail"+color+breed+name);
		}
		
		public static void eating()
		{
			System.out.println("Dog is eating"+color+breed+name);
		}

		public static void main(String[] args) 
		{

			   System.out.println(Dog1.breed);
			   Dog1.barking();
			  
		}

	}

 
