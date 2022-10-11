package collection_Practice_program;

public class Practice12   
{
	//Find the largest number from 3 number
	
	public static void main(String[] args) 
	{
		int a=250;
		int b=64;
		int c=1000;
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("A is Greater "+a);
			}
			else
			{
				System.out.println("C is Greater "+c);
			}
		}
		else
		{
			if (b>c)
			{
				System.out.println("B is Greater "+b);
			}
		}
		
	}
}
