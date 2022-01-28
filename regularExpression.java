//  search a specific string from the given set of strings using regular expressions.



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpression
{

	public static void main(String[] args)
	{
		// For searching
		Pattern pattern = Pattern.compile(" is ");
		
		//Searching for above pattern
		Matcher A = pattern . matcher("My name is Anthony  Gonsalves ");
		
		//Checking for pattern
		while(A.find())
			//printing index
			
			System.out.println("Forund from" + A.start() + "to" +(A.end()-1));

	}

}
