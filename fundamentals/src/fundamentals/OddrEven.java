package fundamentals;

import java.util.Scanner;

public class OddrEven {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}
		
		else
		{
			System.out.println("odd");
		}
	}


}
