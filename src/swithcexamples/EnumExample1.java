package swithcexamples;

enum Colour { Red,Yellow,Green; }

public class EnumExample1 {
	
	//enum Colour { Red,Yellow,Green; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Colour c1 = Colour.Red;
		 Colour c2 = Colour.Yellow;
		System.out.println(c1);
		System.out.println(Colour.Red);
		System.out.println(Colour.Yellow);
		
		 
		 System.out.println(c1.name());
		 System.out.println(c2.name());
		  
		//System.out.println(c1.valueOf());
		
		Colour[] c3 = Colour.values();
		System.out.println(c3);
		System.out.println(c3.length);
		 
		for(int i=0;i<c3.length;i++)
		{
			System.out.println(c3[i]);
		}
		//System.out.println(c1[0]);

	}

}
