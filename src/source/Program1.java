package source;

import java.util.Scanner;

//Write a program that reads two integers from the keyboard.

//If the first number is greater, then you need to display their difference, otherwise do nothing.

public class Program1 {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int numberA = scanner.nextInt();
	        int numberB = scanner.nextInt();

	        if (numberA > numberB) {
	            System.out.println(numberA - numberB);
	        }
	    }

}
