package practice;

public class Test20 
{
	//array in descending order
	
	public static void main(String[] args) 
	{
		int arr[]= {12,26,11,45,134,46};
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
		for (int a=0; a<arr.length; a++)
		{
			System.out.println(arr[a]);
		}
		
	}

}
