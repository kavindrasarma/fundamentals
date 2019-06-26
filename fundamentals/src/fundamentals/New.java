package fundamentals;

public class New {
	public static void main(String args[]) {
		char s='@';
		if((s>='A'&&s<='Z')||(s>='a'&&s<='z'))
			System.out.println("alphabet");
		else if((s>='0')&&(s<='9'))
		{
			System.out.println("digit");
		}
		else 
		{
			System.out.println("special character");
		}
		
	}
}
