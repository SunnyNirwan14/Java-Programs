package practice;

public class Test7 
{
	//how many capital letters in the String
	
	public static void main(String[] args) 
	{
		String s="I Am Kiran Nirwan";
		int lower=0;
		int upper=0;
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=65 && ch<=90)
			{
				upper++;
			}
			else
			{
				lower++;
			}
		}
		System.out.println(upper+" - upper case");
		System.out.println(lower+" -lower case");
		
		
	}

}
