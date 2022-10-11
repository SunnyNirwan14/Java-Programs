package collection_Practice_program;

public class Practice13 
{
	//Finding the largest number from 4 numbers
	
	public static void main(String[] args) 
	{
		int a=30;
		int b=32;
		int c=29;
		int d=31;
		
		if (a>b)
		{
			if (a>c)
			{
				if (a>d)
				{
					System.out.println(a);
				}
				else
				{
					System.out.println(d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
		else
		{
			if (b>c)
			{
				if (b>d)
				{
					System.out.println(b);
				}
				else
				{
					System.out.println(d);
				}
			}
			else
			{
				if (c>d)
				{
					System.out.println(c);
				}
				else
				{
					System.out.println(d);
				}
			}
		}
		
	}

}
