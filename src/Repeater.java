import java.util.Scanner;

public class Repeater
{
	private boolean isFirstLoop = true;
	
	public Repeater(){}
	
	public boolean verifyRepeat(Scanner keyboard)
	{
		String answer;
		
		//if it is the first loop, continue. "do while" functionality.
		if(isFirstLoop)
		{
			isFirstLoop = false;
			return true;
		}
		
		//obtain sanitized input
		System.out.print("Do more? (Yes/No): ");
		answer = keyboard.nextLine().toLowerCase();
		
		//determine answer
		switch(answer)
		{
			case "yes": case "y":
				return true;
			case "no": case "n":
				return false;
			default:
			{
				System.out.println("Incorrect input.");
				return verifyRepeat(keyboard);
			}	
		}
	}
}
