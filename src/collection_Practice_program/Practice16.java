package collection_Practice_program;

import java.util.Scanner;

public class Practice16 
{
	//find the prime number
	
	public static void main(String[] args) 
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number:-");
		int n1=a.nextInt();
		int n=n1;
		int j=0;
		System.out.println("---------------------");
		
		for (int i=1; i<=n; i++)
		{
			if (n%i==0)
			{
				j++;
			}
		}
		if (j==2)
		{
			System.out.println(n+" is prime Number.");
		}
		else
		{
			System.out.println(n+" is not prime Number.");
		}
		
	}

}
