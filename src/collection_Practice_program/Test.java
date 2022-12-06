package collection_Practice_program;

public class Test
{
	//string palindrome 
	public static void main(String[] args)
	{
	
		String s="aba";
		int size=s.length();
		String rev="";
		
		for (int i=(size-1); i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		if (s.equals(rev))
		{
			System.out.println(s+" string is palindrome");
		}
		else
		{
			System.out.println(s+" string in not palindrome");
		}
	}
}
