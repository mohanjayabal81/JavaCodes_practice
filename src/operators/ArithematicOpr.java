package operators;

public class ArithematicOpr {

	public static void main(String[] args) 
	{
		int x = 10, y = 20, z = 0;
		boolean a = true;
		
		a = x>y && (z=x+y)>15;
		System.out.println("a = " + a + ", and z = " + z);
		
		a = x>y & (z=x+y)>15;
		System.out.println("a = " + a + ", and z = " + z);
		 

	}

}
