package collection_Practice_program;

public class Test1 
{
	//largest number in the array
	public static void main(String[] args)
	{
		int a[]= {10,20,50,80,70};
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
