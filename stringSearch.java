// search a string entered by a user from the array of string
import java.util.*;
public class stringSearch {

	public static void main(String[] args)
	{
		String[] strArray1 = {"Himanshu","Rahul","Ram"};
		boolean found = false;
		int index = 0;
		String s = "Himanshu";
		for(int i = 0; i < strArray1.length;i++)
		{
			if (s.equals(strArray1[i]))
			{
				index = i; found = true;
				break;
			}
		}
		if (found)
			
		System.out.println(s+ "Found at index"+index);
		else	
			
			System.out.println(s+ "not found");
		
			
	}

}
