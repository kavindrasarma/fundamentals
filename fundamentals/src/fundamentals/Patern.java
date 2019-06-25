package fundamentals;

public class Patern {
	public static void main(String args[])
	{
	    int	k=Integer.parseInt(args[0]);
	    for(int i=0;i<k;i++)
	    {
	    	for(int j=0;j<=i;j++)
	    	{
	    		System.out.print("*");
	    	}
	    	System.out.println(" ");
	    }
	}
}
