package swithcexamples;

//An Enum class
enum Day1 {
SUNDAY,
MONDAY,
TUESDAY,
WEDNESDAY,
THURSDAY,
FRIDAY,
SATURDAY;
}
public class EnumExample3 {
	//Driver class that contains an object of "day" and
	//main().
	 
	 Day1 day;

	 // Constructor
	 public EnumExample3(Day1 day) { this.day = day; }

	 // Prints a line about Day using switch
	 public void dayIsLike()
	 {
	     switch (day) {
	     case MONDAY:
	         System.out.println("Mondays are bad.");
	         break;
	     case FRIDAY:
	         System.out.println("Fridays are better.");
	         break;
	     case SATURDAY:
	     case SUNDAY:
	         System.out.println("Weekends are best.");
	         break;
	     default:
	         System.out.println("Midweek days are so-so.");
	         break;
	     }
	 }

	 // Driver method
	 public static void main(String[] args)
	 {
	     String str = "MONDAY";
	     EnumExample3 t1 = new EnumExample3(Day1.valueOf(str));
	     t1.dayIsLike();
	 }

}




 
