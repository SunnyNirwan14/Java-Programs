package collection_Practice_program;

public class Practice29 
{
	//Star Pattern - Lower Pyramid
	/*
	 * 		* * * *
	 * 	   * * * * *
	 *    * * * * * *
	 */
	public static void main(String[] args) 
	{
		

	int a;
	int b;
	int c;
	
	for (a=4; a<=6; a++)
	{
		for (b=6; b>a; b--)
		{
			System.out.print(" ");
		}
		for (c=1; c<=a; c++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	}

}
