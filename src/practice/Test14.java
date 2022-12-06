package practice;

public class Test14 
{
	//quadrant 1
	
	public static void main(String[] args) 
	{
		/*
		 * 		*
		 * 		**
		 * 		***
		 * 		****
		 * 		*****
		 * 		******
		 */
		
		int row;
		int str;
		int star=6;
		for (row=1; row<=star; row++)
		{
			for (str=1; str<=row; str++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
