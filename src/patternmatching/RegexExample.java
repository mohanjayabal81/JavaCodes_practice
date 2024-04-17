package patternmatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) 
	{
		Pattern p = Pattern.compile(".as");//. represents single character  
		Matcher m = p.matcher("a");  
		boolean b = m.matches();  
		System.out.println(b);

	}

}
