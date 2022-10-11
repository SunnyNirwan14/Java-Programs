package collection_Practice_program;

import java.util.Scanner;

public class Practice02 
{
	//To find Armstrong number with- while loop for 3 No.
	
	public static void main(String[] args)
	{
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=a.nextInt();
		int n=num1;
		int rem;
		int add=0;
		
		while (n!=0)
		{
			rem=n%10;
			n=n/10;
			
			add=add+(rem*rem*rem);		//for 3 no. & 4 no.
		}
		
		if (num1==add)
		{
			System.out.println(num1+" is Armstrong number.");
		}
		else
		{
			System.out.println(num1+" is not Armstrong number.");
		}
	}

}
