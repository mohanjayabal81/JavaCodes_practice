package swithcexamples;

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExample2 {
	
	//Day day;
	
	public Day dayIsLike(Day day)
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
		return day;
    }
	
	public static void main(String[] args)
	{
		String str = "WEDNESDAY";
		EnumExample2 obj = new EnumExample2();
		Day value = obj.dayIsLike(Day.valueOf(str));
		System.out.println(value);
	 
		
	}

}
