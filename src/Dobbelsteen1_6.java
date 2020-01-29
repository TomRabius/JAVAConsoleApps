import java.util.Scanner;
import java.lang.Math; 

public class Dobbelsteen1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\nWelcome to the 6-sided dice app. \n");
		Scanner sc = new Scanner(System.in);
		String rollStop = "r";
		
		// math.random gives 0.0 to 0.99999 * 6 max 5.99999 + 1 rounded down by int.
		int dobbelsteen = 0;
		while(true)
		{			
			dobbelsteen = (int)((Math.random() * 6) +1); 
			
			System.out.println("Type 'r' to roll the dice. Or type 's' to quit playing.");
			System.out.println(">> " + dobbelsteen + " <<");
			rollStop = sc.next();
			if(rollStop.equalsIgnoreCase("s"))
			{
				 break;
			 }
			
		}
	}

}
