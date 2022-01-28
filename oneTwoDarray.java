
public class oneTwoDarray {

	public static void main(String[] args)
	{
		int[] a[] , b = {20};
		a =  new int[3][3];
		b = new int [5];
		
		// 1D ARRAY
		
		for( int i = 0; i < 3; i ++)
			System.out.println(b[i]);	
		
		// 2D ARRAY
		
		for(int i = 0; i <3 ; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				a[i][j] = 100;
				System.out.println(a[i][j]);
			}
		}
			

	}

}
