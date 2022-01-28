class outerClass
{
	int num;
	private class innerC
	{
		public void print()
		{
			System.out.println("Inner class");
		}
	}
	void display_inner()   // Accessing Inner class with the help of method within
	{
		innerC inner =  new innerC();
		inner .print();
	}
}
public class innerClasses 
{

	public static void main(String[] args)
	{
	outerClass outer = new outerClass(); //instantiating outer class
		
	outer.display_inner(); // Display method.

	}

}
