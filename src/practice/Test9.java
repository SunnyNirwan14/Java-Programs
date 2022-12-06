package practice;

public class Test9 
{
	//addition of numbers present in the string
	
	public static void main(String[] args) 
	{
		String s="s5fsa3fas51";
		int add=0;
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=48 && ch<=57)
			{
				add=add+Character.getNumericValue(ch);
				
				
			}
			
		}
		System.out.println(add);
		
	}

}
