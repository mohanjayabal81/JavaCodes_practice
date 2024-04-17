package collectionExample;

public class TestGenericClass 
{

	public static void main(String[] args) 
	{
		GenericClass<Integer> m=new GenericClass<Integer>();  
		m.add(2);  
		//m.add("vivek");//Compile time error  
		System.out.println(m.get());  
	}
	
	
	
}  
