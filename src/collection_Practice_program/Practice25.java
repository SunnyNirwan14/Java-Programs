package collection_Practice_program;

public class Practice25 
{
	public static void main(String[] args) 
	{
		//Star Pattern - 2nd Quadrant
		/*
		 * 			*
		 * 		   **
		 * 		  ***
		 * 		 ****
		 * 		*****
		 * 	   ******
		 */
		
		int a;
		int b;
		int c;
		
		for (a=1; a<=6; a++) 
		{
			for (b=6; b>a; b--)
			{
				System.out.print(" ");
			}
			for (c=1; c<=a; c++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
