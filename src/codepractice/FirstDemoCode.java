package codepractice;

class FirstDemoCode {
	
	 
	
	int a=15; // Instance Variable Declaration 
	
	void myMethod() // Method Declaration 
	{
		int a=20; // Local Variable 
		System.out.println(a); // Print the Local Variable
		System.out.println(this.a); // Print the Local Variable
	}

	public static void main(String[] args)   
	{
		 int a=10; // Local Variable
		 
		 System.out.println(a);
		 
		// FirstDemoCode obj = new FirstDemoCode();
		// System.out.println(obj.a);
		// obj.myMethod();
		 

	}

}
