// search a string entered by a user from the array of string

import java.util.*;

public class StringSearchuserInput {

	public static void main(String[] args) 
	{
		Scanner scanner =  new Scanner (System.in);
		// to read and store the user input string 
		String inputString; 
		
		//to store sub-string
		String subString;
		
		//asking user for string
		System.out.println("Enter a String");
		inputString = scanner.nextLine();
		
		//asking for to enter a string what user want to find
		System.out.println("String to Find");
		subString = scanner.next();
		
		//indexOf() will return the index number. 
		int index = inputString.indexOf(subString);
		
		if(index != -1)
		{
			System.out.println("Index of user input string:" +index);
		}
		else  //Else, it will return -1.
		{
			System.out.println("string not found");
		}
		

	}

}
