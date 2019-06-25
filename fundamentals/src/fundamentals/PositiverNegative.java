package fundamentals;

import java.util.Scanner;

public class PositiverNegative {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("zero");
		}
		if(n>0)
		{
			System.out.println("");
		}
		if(n<0)
		{
			System.out.println("negative");
		}
	}

}
