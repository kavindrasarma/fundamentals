package fundamentals;

public class Percentage {
	public static void main(String args[])
	{
		String s=args[0] ;
		int i=6;
		if(args[0].equals("female"))
		{
			if((i>=1)&&(i<=58))
			{
				System.out.println("8.2%");
			}
			else if((i>=59)&&(i<=100))
			{
				System.out.println("9.4%");
			}
		}
		if(args[0].equals("male"))
		{
			if((i>=1)&&(i<=58))
			{
				System.out.println("8.4%");
			}
			else if((i>=59)&&(i<=100))
			{
				System.out.println("10.5%");
			}
		}
	}

}
