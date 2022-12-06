package practice;

public class Test12 
{
	//find duplicate from array
	
	public static void main(String[] args)
	{
		int []arr={12,11,15,46,11,45};
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println(arr[j]+" number is duplicate number");
				}
			}
		}
	}

}
