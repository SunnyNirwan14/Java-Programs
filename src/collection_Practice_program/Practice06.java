package collection_Practice_program;

public class Practice06 
{
	//Convert the given string in sequence of character
	
	public static void main(String[] args) 
	{
		String s="hello";    
		for(int i=0; i<s.length();i++)
		{  
		   char c = s.charAt(i);  
		   System.out.println("char at "+c+" index is: "+i);
		}
	}

}
