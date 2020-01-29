import java.util.Scanner;

public class Dobbelsteen1_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\nWelcome to the double 6-sided dice app. \n");
		Scanner sc = new Scanner(System.in);
		String rS = "r";
		
		// math.random gives 0.0 to 0.99999 * 6.
		int dobbelsteen = 0;
		while(true)
		{			
			dobbelsteen = (int)(Math.random() * 11); 
			dobbelsteen++;
			dobbelsteen++;
			System.out.println("Type 'r' to roll the dice. Or type 's' to quit playing.");
			System.out.println(">> " + dobbelsteen + " <<");
			rS = sc.next();
			if(rS.equalsIgnoreCase("s"))
			{
				 break;
			 }
			
		}
	}

}
