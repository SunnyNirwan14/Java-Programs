package collection_Practice_program;

public class Practice27 
{
	public static void main(String[] args) 
	{
		// Star Pattern - 4th Quadrant
		/*
		 * 		******
		 * 		*****
		 * 		****
		 * 		***
		 * 		**
		 * 		*
		 */
		
		
		int a;
		int b;
		
		for (a=1; a<=6; a++)
		{
			for (b=6; b>=a; b--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
