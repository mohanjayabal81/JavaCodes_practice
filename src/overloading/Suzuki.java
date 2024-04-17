package overloading;

public class Suzuki extends Bike
{

	@Override
	public void enginerun() {
		System.out.println("suzuki Engine is running..");
		
	}
	
	public static void main(String[] args)
	{
		
		Suzuki b = new Suzuki();
		b.enginerun();
	}

}
