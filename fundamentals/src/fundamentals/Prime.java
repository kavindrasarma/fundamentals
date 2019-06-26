package fundamentals;

public class Prime {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]),c=0;
		for(int i=2;i<=n;i++) {
			if(n%i==0)
			{
				c++;
			}
			}
		if(c==1)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not a prime");
		}
	}
}
