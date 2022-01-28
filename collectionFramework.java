// demonstrate the uses of collections and its types.

import java.io.*;
import java.util.*;

public class collectionFramework {

	public static void main(String[] args) 
	{
		int arr[] = new int[] { 1, 2, 3, 4 };
        Vector<Integer> v = new Vector();
        Hashtable<Integer, String> h = new Hashtable();  // vector and hashtable
        
        v.addElement(1);
        v.addElement(2);  // adding elements in an vector
        
        h.put(1, "Ramesh");
        h.put(2, "Suresh"); // adding elements in an hashtable
        
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(2));  //array vector hashtable
	}

}
