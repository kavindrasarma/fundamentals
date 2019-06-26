package fundamentals;

public class Args {
	public static void main(String args[]) {
		char c='G';
		switch(c)
		{
		case 'R':System.out.println("RED");
		break;
		case 'G':System.out.println("GREEN");
		break;
		case 'B':System.out.println("BLUE");
		break;
		case 'O':System.out.println("ORANGE");
		break;
		case 'Y':System.out.println("YELLOW");
		break;
		case 'W':System.out.println("White");
		break;
		default :System.out.println("invalid colour");
		}
	}
}
