package collection_Practice_program;

public class Practice08 
{
	//Find duplicate number from array
	
	public static void main(String[] args) 
	{
		//Find duplicate number from array
		
		int a[]= {10,20,30,40,50,60,20,10};
		int size=a.length;
		System.out.println("The size of array is "+size);
		
		for (int i=0; i<size; i++)
		{
			for (int j=i+1; j<size; j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]+" is duplicate number");
				}
			}
		}
		
	}

}
