package collection_Practice_program;

public class Practice26 
{
	public static void main(String[] args) 
	{
		//Star Pattern - 3rd quadrant
		/*
		 * 		******
		 * 		 *****
		 * 		  ****
		 * 		   ***
		 * 			**
		 * 			 *
		 * 		
		 */
		
		int a;
		int b;
		int c;
		
		
		for (a=1; a<=6; a++)
		{
			for (b=1; b<a; b++)
				{
					System.out.print(" ");
				}
			for (c=6; c>=a; c--)
				{
					System.out.print("*");
				}
			System.out.println();	
			
		}
		
	}

}
