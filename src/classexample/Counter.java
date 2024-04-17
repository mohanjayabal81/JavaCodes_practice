package classexample;

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter
{  
	static int count=0;//will get memory each time when the instance is created  

	Counter()
	{  
		count++;//incrementing value  
		System.out.println(count);  
	}  
	
	void printmyname()
	{
		System.out.println("This is my name..");
	}

	public static void main(String args[]){  
		//Creating objects  
		Counter c1=new Counter();  
		c1.printmyname();
		Counter c=new Counter();  
		c1.printmyname();
		Counter c3=new Counter(); 
		c1.printmyname();
	}  
}  