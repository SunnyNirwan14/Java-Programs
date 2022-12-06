package practice;


public class Test26 
{
	//addition of numbers present in the string
	public static void main(String[] args) 
	{
		String s="A23aB6b5CcD9D";
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
