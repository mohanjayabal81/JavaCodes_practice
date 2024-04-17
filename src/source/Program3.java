package source;

import java.util.Scanner;

public class Program3 {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number / 1000 > 0) {
            // do nothing
        } else if (number / 100 > 0) {
            int number1 = number % 10;
            int number2 = number / 10 % 10;
            int number3 = number / 100 % 10;
            System.out.println(number1 + number2 + number3);
        } else if (number / 10 > 0) {
            int number1 = number % 10;
            int number2 = number / 10 % 10;
            System.out.println(number1 * number2);
        } else {
            System.out.println(number);
        }
    }

}
