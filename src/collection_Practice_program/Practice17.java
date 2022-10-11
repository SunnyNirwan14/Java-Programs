package collection_Practice_program;

public class Practice17 
{
	//Find Prime no from array
	
	public static void main(String[] args) 
	{
		int a[]={12,11,13,44,49};
		int b;
		
		
		int size=a.length;
		System.out.println("The size of aaray "+size);
		System.out.println("========================");
		
		for (b=0; b<size; b++)
		{
			int d=0;
			for (int c=1; c<=a[b]; c++)
			{
				if (a[b]%c==0)
				{
					d++;
				}
			}
			if (d==2)
			{
				System.out.println(+a[b]+" number is prime number ");
			}
			
		}
		
		
	}

}
