package practice;

public class Test15 
{
	//quadrant 3&4
	
	public static void main(String[] args) 
	{
		/*
		 * 		*********
		 * 		 *******
		 * 		  *****
		 * 		   ***
		 * 			*
		 * 			
		 */
		
		int a;
		int b;
		int c;
		
		for (a=1; a<10; a++)
		{
			for (b=1; b<a; b++)
			{
				System.out.print(" ");
			}
			for (c=9; c>=(2*a-1); c--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
