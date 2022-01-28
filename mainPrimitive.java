//Program to convert string to different primitive data types in Java

public class mainPrimitive 
{
	public static int toInt(String s)
	{
		return Integer.parseInt(s);
	}
	public static long tolong(String s)
	{
		return Long.parseLong(s);
	}
	public static double todouble(String s)
	{
		return Double.parseDouble(s);
	}
	public static boolean toboolean(String s)
	{
		return Boolean.parseBoolean(s);
	}
	public static void main(String[] args)
	{
		String s = "1";
		System.out.println("To primitive int: " + toInt(s));
		System.out.println("To primitive int: " + tolong(s));
		System.out.println("To primitive int: " + todouble(s));
		System.out.println("To primitive int: " + toboolean(s));
	}
}


