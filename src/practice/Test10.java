package practice;

public class Test10 
{
	//Find out the numbers present in the String
	
	public static void main(String[] args) 
	{
		String s="ssf4s51s32";
		int add=0;
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=48 && ch<=57)
			{
				//add=Character.getNumericValue(ch);
				//System.out.println(add);
				System.out.println(ch);
			}
		}
		
		
	}

}
