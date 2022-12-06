package collection_Practice_program;

public class Practice20 
{
	//Reverse the string
	
	public static void main(String[] args)
	{  
		
		String s="Testing";
		String rev=" ";
		
		for (int i=s.length()-1; i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}  
}

