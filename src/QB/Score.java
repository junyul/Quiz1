package QB;
import java.util.Scanner;
public class Score{
Scanner input = new Scanner(System.in);
	private double Players_score;

	System.out.println("Please enter your ATT ;");
	A = input.nextInt();
	System.out.println("Please enter your COMP : ");
	C = input.nextInt();
	System.out.println("Please enter your YDS : ");
	Y = input.nextInt();
	System.out.println("Please enter your TD : ");
	T = input.nextInt();
	System.out.println("Please enter your INT : ");
	I = input.nextInt();

	
	public Score(int C, int A, int Y, int T, int I){
		
		double Players_score= (((C/A-0.3)*5+(Y/A-3)*0.25+(T/A)*20+(2.375-25*I/A))/6)*100;
	}
	
	public double QB() {
		return Players_score;
	}
		
		
	
}
