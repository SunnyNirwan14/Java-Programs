package collection_Practice_program;

public class Practice22 
{
	//Printing Array in reverse order
	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b=a.length;
		
		System.out.println(b);
		System.out.println("===============================");
		
		for (int c=(a.length-1); c>=0; c--)
		{
			System.out.println(a[c]);
		}
		
	}

}
