package source;

public class DebuggingCode {
	
	private static int numberDayOfWeek = 6; // Sunday - 0, Monday - 1, ..., Saturday - 6.

    public static void main(String[] args) {
        boolean isWeekEnd = numberDayOfWeek == 0 || numberDayOfWeek == 6;

        System.out.println(isWeekEnd);
    }


}
