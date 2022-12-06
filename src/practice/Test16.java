package practice;

import java.util.Scanner;

public class Test16 
{
	public static void main(String[] args) 
	{
		//to find armstrong numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num1=sc.nextInt();
		int num=num1;
		int sum=0;
		int rem;
		
		int temp=num;
		
		while (num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
			
		}
		if (temp==sum)
		{
			System.out.println(temp+" number is armstrong number");
		}
		else
		{
			System.out.println(temp+" Number is not armstrong number");
		}
		
	}

}
