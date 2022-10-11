package collection_Practice_program;

public class Practice18 
{
	//Sort array in descending order
	
	public static void main(String[] args) 
	{
		int a[]= {100,25,43,65,1};
		
		for (int b=100; b>=1; b--)
		{
			for (int c=(a.length-1); c>=0; c--)
			{
				if (a[c]==b)
				{
					System.out.println(b);
				}
			}
		}
		
	}

}
