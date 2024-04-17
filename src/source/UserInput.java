package source;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args)
	{int num;
	 
    // Input the integer
    System.out.println("Enter the integer: ");

    // Create Scanner object
    @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);

    // Read the next integer from the screen
    num = s.nextInt();

    // Display the integer
    System.out.println("Entered integer is: "
                       + num);
}
	
		 

	}

 
