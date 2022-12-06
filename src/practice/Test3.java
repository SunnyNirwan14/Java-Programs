package practice;

public class Test3 
{
	//Find the largest number in the array
	public static void main(String[] args)
	{
		int a[]= {90,15,61,42,49,89,84};
		int max=a[0];
		
		
		for (int i=0; i<a.length; i++)
		{
				if (a[i]>max)
				{
					max=a[i];
				}
			
		}
		System.out.println(max);
	}

}
