package fundamentals;

public class Palindrome {
	public static void main(String args[])
	{
		int i=Integer.parseInt(args[0]),k,rev=0;
		while(i>0)
			{
			k=i%10;
			rev=rev*10+k;
			i=i/10;
	
	}
		if(rev==i)
		{
			System.out.println("palindrome");
			
	}
		else{
				System.out.println(" not palindrome");
				
		}
	}


}
