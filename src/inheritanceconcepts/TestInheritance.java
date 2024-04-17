package inheritanceconcepts;


class TestInheritance  extends Dog
{  
	
	void mymethod()
	{
		System.out.println("This is my method...");
	}
	public static void main(String args[])
	{  
		TestInheritance obj = new TestInheritance();
		obj.mymethod();
		obj.bark();
		obj.eat();
	}}  