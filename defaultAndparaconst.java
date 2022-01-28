// demonstrate the uses of constructors and its types.
 
public class defaultAndparaconst
{
	defaultAndparaconst()
	{
		System.out.println("Zero argument constructor");
	}
	defaultAndparaconst(int a)
	{
		System.out.println("One argument constructor");
	}
	
	defaultAndparaconst(int a, int b)
	{
		System.out.println("Two arguments constructor");
	}
	public static void main(String[] args) 
	{
		defaultAndparaconst d = new defaultAndparaconst(); // Calling default constructor
		d = new defaultAndparaconst(20); // one arguments
		
		d = new defaultAndparaconst(10,40); // two arguments
	}
}
