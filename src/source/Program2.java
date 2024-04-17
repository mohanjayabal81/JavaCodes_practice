package source;

import java.util.Scanner;

//Write a program that reads two integers from the keyboard.

//If both numbers are positive or both are negative, then you need to display their product, otherwise print their sum.

public class Program2 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int numberA = scanner.nextInt();
	        int numberB = scanner.nextInt();

	        if (numberA * numberB > 0) {
	            System.out.println(numberA * numberB);
	        } else {
	            System.out.println(numberA + numberB);
	        }
	    }

}
