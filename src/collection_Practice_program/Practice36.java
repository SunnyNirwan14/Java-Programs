package collection_Practice_program;

public class Practice36 
{
	public static void main(String[] args) 
	{
		//Star Pattern - Square Rhombus
		/*	
		 * 		**********
		 * 	   **********
		 * 	  **********
		 * 	 **********
		 * 		
		 */
		
		int a;
		int b;
		int c;
		
		for (a=1; a<=4; a++)
		{
			for (b=4; b>a; b--)
			{
				System.out.print(" ");
			}
			for (c=1; c<=10; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
