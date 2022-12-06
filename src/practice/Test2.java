package practice;

public class Test2 
{
	public static void main(String[] args)
	{
		String s="Sunny";
		String rev=" ";
		
		String a=s.substring(2);
		System.out.println(a);
		
		for (int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
