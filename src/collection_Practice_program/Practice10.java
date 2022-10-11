package collection_Practice_program;

public class Practice10 
{
	//Find largest number from array
	
	public static void main(String[] args) 
	{
		int a[]= {250,255,650,260,270};
		int b=a.length;
		System.out.println("The size of array "+b);
		System.out.println("===========================");
		
		if (a[0]>a[1])
		{
			if (a[0]>a[2])
			{
				if (a[0]>a[3])
				{
					if (a[0]>a[4])
					{
						System.out.println(a[0]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
				else
				{
					if (a[3]>a[4])
					{
						System.out.println(a[3]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
			}
			else
			{
				if (a[2]>a[3])
				{
					if (a[2]>a[4])
					{
						System.out.println(a[2]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
				else
				{
					if (a[3]>a[4])
					{
						System.out.println(a[3]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
			}
		}
		else
		{
			if (a[1]>a[2])
			{
				if (a[1]>a[3])
				{
					if (a[1]>a[4])
					{
						System.out.println(a[1]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
				else
				{
					if (a[3]>a[4])
					{
						System.out.println(a[3]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
			}
			else
			{
				if (a[2]>a[3])
				{
					if (a[2]>a[4])
					{
						System.out.println(a[2]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
				else
				{
					if (a[3]>a[4])
					{
						System.out.println(a[3]+" is the largest number");
					}
					else
					{
						System.out.println(a[4]+" is the largest number");
					}
				}
			}
		}
		
	}

}
