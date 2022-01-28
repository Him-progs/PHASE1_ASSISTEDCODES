
public class stringExamples {

	public static void main(String[] args) 
	{
		String A = "Name : ";
		
	// converting string object to stringbuffer
		
		StringBuffer B = new StringBuffer (A);
		
		B.reverse(); // reverse method
		
		System.out.println(B);
		
		// converting string to stringBuilder 
		
		StringBuilder A1 = new StringBuilder(A);
		
		A1.append("Himanshu"); // append method
		
		System.out.println(A1);
	}

}
