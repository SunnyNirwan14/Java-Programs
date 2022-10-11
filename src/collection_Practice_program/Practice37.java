package collection_Practice_program;

public class Practice37 
{
	public static void main(String[] args) 
	{
		//Star Pattern - Diamond
		/*
		 * 			*
		 * 		   ***
		 * 		  *****
		 * 		 *******
		 * 		*********
		 * 		 *******
		 * 		  *****
		 * 		   ***
		 * 			*
		 */
		
		int a;
		int b;
		int c;
		
		for (a=1; a<=5; a++)
		{
			for (b=5; b>a; b--)
			{
				System.out.print(" ");
			}
			for (c=1; c<=(2*a-1); c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (a=1; a<=5; a++)
		{
			for (b=1; b<=a; b++)
			{
				System.out.print(" ");
			}
			for (c=7; c>=(2*a-1); c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
