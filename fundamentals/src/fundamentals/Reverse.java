package fundamentals;
import java.lang.*;
public class Reverse {
	public static void main(String args[])
	{
		int i=Integer.parseInt(args[0]),k,rev=0;
		while(i>0)
			{
			k=i%10;
			rev=rev*10+k;
			i=i/10;
	
	}
		System.out.println(rev);
	}
	}
