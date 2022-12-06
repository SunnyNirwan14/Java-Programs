package collection_Practice_program;

public class Practice09 
{
	public static void main(String[] args)
	{
		String s[]= {"sunny","kiran","manish","sunny","monty"};
		int size=s.length;
		
		for (int i=0; i<size; i++)
		{
			for (int j=i+1; j<size; j++)
			{
				if (s[i].equals(s[j]))
				{
					System.out.println(s[i]+" is duplicate string");
				}
			}
		}
	}

}
