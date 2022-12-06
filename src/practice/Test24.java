package practice;

public class Test24 
{
	//Palindrome number
	public static void main(String[] args) 
	{
		int num=505;
		int sum=0;
		int rem;
		int temp=num;
		
		while (num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		if (temp==sum)
		{
			System.out.println(temp+" number is palindrome");
		}
		else
		{
			System.out.println(sum+" number is not palindrome");
		}
		
		
	}

}
