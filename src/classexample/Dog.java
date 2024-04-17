package classexample;

public class Dog 
{
	String color;
	String breed;
	String name;
	
	public void barking()
	{
		System.out.println("Dog is barking"+color+breed+name);
	}
	
	public void waggingTail()
	{
		System.out.println("Dog is waggingTail"+color+breed+name);
	}
	
	public void eating()
	{
		System.out.println("Dog is eating"+color+breed+name);
	}

	public static void main(String[] args) 
	{

		  Dog pom = new Dog();
		  pom.name = "Jacky";
		  pom.color = "black";
		  pom.breed = "Double";
		  pom.barking();
		  pom.eating();
		  pom.waggingTail();
		   
		  Dog lab = new Dog();
		  lab.name = "Max";
		  lab.breed = "Lab";
		  lab.color = "Brown";
		  lab.barking();
		  lab.eating();
		  lab.waggingTail();
		  Dog gs = new Dog();
		  gs.name = "tokyo";
		  gs.breed = "double coat";

	}

}
