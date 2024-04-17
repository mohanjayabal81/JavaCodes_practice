package collectionExample;

import abstractionexample.Honda;

public class GenericClass<T>
{  
	Honda obj1;
	T obj;  
	void add(T obj)
	{
		this.obj=obj;

	}  

	T get()
	{
		return obj;
	}  
	
		//T - Type
		//E - Element
		//K - Key
		//N - Number
		//V - Value
}  