package practice;

public class Test18 
{
	public static void main(String[] args) 
	{
		String s="Kiran Nirwan";
		char[] chararr=s.toCharArray();
	
		
		for (int i=0; i<s.length(); i++)
		{
			for (int j=i+1; j<s.length(); j++)
			{
				if (chararr[i]==chararr[j])
				{
					System.out.println(chararr[j]);
				}
			}
		}
		
	}

}
