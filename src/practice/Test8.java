package practice;

public class Test8 
{
	//addition of numbers present in the string
	
	public static void main(String[] args) 
	{
		String s="Anjad4s2cas2f2152";
		int add=0;
		
		for (int i=0; i<s.length(); i++)
		{
			if (Character.isDigit(s.charAt(i)))
			{
				add=add+Character.getNumericValue(s.charAt(i));
			}
		}
		System.out.println(add);
		
	}

}
