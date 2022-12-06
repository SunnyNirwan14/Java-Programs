package collection_Practice_program;

public class Practice10 
{
	//Find largest number from array
	
	public static void main(String[] args) 
	{
		int a[]= {250,700,650,260,270};
		int b=a.length;
		System.out.println("The size of array "+b);
		System.out.println("===========================");
		int max=a[0];
		
		for (int i=0; i<b; i++)
		{
			if (a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max+" is the largest value from array");
		
	}

}
