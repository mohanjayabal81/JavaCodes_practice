package source;

public class DebuggingCode2 {
	
	private static int numberOfMonth = 12; // January - 1, February - 2, ..., December - 12

    public static void main(String[] args) {
        boolean condition1 = numberOfMonth >= 1;
        boolean condition2 = numberOfMonth <= 2;
        boolean condition3 = numberOfMonth == 12;
        boolean isWinter = (condition1 && condition2) || condition3;
        System.out.println(isWinter);
    }


}
