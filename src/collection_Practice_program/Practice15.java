package collection_Practice_program;

public class Practice15 
{
	//Find palindrome number
	
	public static void main(String[] args) 
	{
		 int r,sum=0,temp;    
		 int n=121;//It is the number variable to be checked for palindrome  
		  
		 temp=n;    
		 while(n>0)
		 {    
		   r=n%10;  //getting remainder  1,2,1
		   sum=(sum*10)+r;    //1,2,1
		   n=n/10;    //12,1
		  }  
		 
		  if(temp==sum)
		  {
		   System.out.println(sum+" palindrome number ");    
		  }
		  else
		  {
		   System.out.println(sum+" not palindrome"); 
		  }
	}

}
