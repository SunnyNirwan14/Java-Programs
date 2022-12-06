package practice;

public class Test1 
{
	//reverse the string in its position
	
	public static void main(String[] args)
	{
		String s="Kiran Nirwan";
		String arr[]=s.split(" ");
		String rev=" ";
		
		for (int i=0; i<arr.length; i++)
		{
			String a=" ";
			a=arr[i];
			String rev1=" ";
			
			for (int j=a.length()-1; j>=0; j--)
			{
				rev1=rev1+a.charAt(j);
			}
			rev=rev+rev1;
		}
		System.out.println(rev);
	}

}
