package collection_Practice_program;

public class Practice34 
{
	public static void main(String[] args) 
	{
		//Star Pattern - left rhombus
		/*	*****
		 * 	 *****
		 * 	  *****
		 * 	   *****
		 * 	    *****
		 */
		
		int a;
		int b;
		int c;
		
		for (a=1; a<=5; a++)
		{
			for (b=1; b<a; b++)
			{
				System.out.print(" ");
			}
			for (c=1; c<=5; c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
