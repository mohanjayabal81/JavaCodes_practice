package classexample;

//Java Program to illustrate how to define a class and fields  
//Defining a Student class.  
class Student{  
	//defining fields  
	int id = 10;//field or data member or instance variable  
	
	String name = "Mohan Cute Boy";  
	
	//creating main method inside the Student class  
	
	public void myMethod()
	{
		System.out.println("THis is my method"+id+name);
	}
	
	public static void main(String args[]){ 
		
		int id = 20;
		
		
		//Creating an object or instance  
		Student s1=new Student();//creating an object of Student  
		
		s1.name = "Hello";
		s1.id = 20;
		
		//Printing values of the object  
		System.out.println(id);
		
		System.out.println(s1.id);//accessing member through reference variable  
		System.out.println(s1.name); 
		s1.myMethod();
	}  
}  