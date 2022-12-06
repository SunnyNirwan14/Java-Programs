package practice;

public class Test5 
{
	//find out how many capital letters in string
	
	public static void main(String[] args)
	{
		String s="Software Testing QA";
		String lower="";
		String upper="";
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=65 && ch<=90)
			{
				upper=upper+ch;
			}
			else
			{
				lower=lower+ch;
			}
		}
		System.out.println(upper+" -Capital letters");
		System.out.println(lower+" -lower alphabets");
		
	}

}
