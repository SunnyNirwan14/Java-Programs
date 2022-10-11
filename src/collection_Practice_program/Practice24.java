package collection_Practice_program;

public class Practice24 
{
	public static void main(String[] args) 
	{
		// Star Pattern - 1st Quadrant
		/*
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 	    ******		
		 */
		
		int a;
		int b;
		
		
		for (a=1; a<=6; a++)
		{
			
			for (b=1; b<=a; b++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
