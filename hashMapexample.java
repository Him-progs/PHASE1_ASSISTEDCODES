//TO DEMONSTRATE THE USES OF MAP.



import java.util.*;

public class hashMapexample 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String>map=new
				
		HashMap<Integer,String>(); // Creating Hashmap
		
		map.put(1, "Mango"); // Putting Elements in map
		
		map.put(2, "Apple");
		
		map.put(3, "Banana");
		
		map.put(4, "Grapes");

		for(Map.Entry m: map.entrySet())
		{
			System.out.println(m.getKey()+""+m.getValue());
		}

	}

}
