package collection_Practice_program;

public class Practice18 
{
	//Sort array in descending order
	
	public static void main(String[] args) 
	{
		int a[]= {100,25,43,65,1};
		int temp=0;
		
		for (int b=0; b<a.length; b++)
		{
			for (int c=b+1; c<a.length; c++)
			{
				if (a[b]<a[c])
				{
					temp=a[b];
					a[b]=a[c];
					a[c]=temp;
				}
			}
		}
		for (int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
