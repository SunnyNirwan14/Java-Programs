package practice;

public class Test21 
{
	public static void main(String[] args) 
	{
		String s="Kiran Nirwan TesTing";
		String upper="";
		String lower="";
		int count=0;
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=65 && ch<=90)
			{
				upper=upper+ch;
				count++;
			}
			else
			{
				lower=lower+ch;
			}
		}
		//System.out.println(count);
		System.out.println(upper);
		//System.out.println(lower);
		
		/*
		 * note:-  A to Z  ascii value range 65 to 90
		 * 			a to z ascii value range 97 to 122
		 * 			0 to 9 					 48 to 57
		 */
	}

}
