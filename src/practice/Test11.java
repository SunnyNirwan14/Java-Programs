package practice;

public class Test11 
{
	//find out the character present in the string
	
	public static void main(String[] args) 
	{
		String s="nfds4fds52s5";
		char char1;
		
		for (int i=0; i<s.length(); i++)
		{
			char ch=s.charAt(i);
			if (ch>=97 && ch<=122)
			{
				char1=ch;
				System.out.println(ch);
			}
		}
		
	}

}
