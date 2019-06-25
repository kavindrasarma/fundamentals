package fundamentals;

public class Sumofnum {
public static void main(String args[])
{
    int	i=Integer.parseInt(args[0]),sum=0,k;
	
	for(int j=1;i>0;j++)
	{
	k=i%10;
	sum=sum+k;
	i=i/10;
	}
	System.out.println(sum);
}
}
