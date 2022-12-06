package practice;

public class Test4 
{
	//print the array in descending order
	
	public static void main(String[] args)
	{
		int arr[]= {12,61,54,46,69,79,41};
		int temp;
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int b=0; b<arr.length; b++)
		{
			System.out.println(arr[b]);
		}
	}

}
