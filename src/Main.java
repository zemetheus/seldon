import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String username, command;
		Environment environment;
		boolean repeat = true;
		
		System.out.print("Username:");
		username = keyboard.nextLine();
		//System.out.print("Password");
		
		System.out.println("Welcome, "+username+"! Please wait while I check the filesystem integrity.");
		
		environment = EnvironmentManager.setUpEnvironment();
		
		//command loop
		while(repeat)
		{
			System.out.println("How can I assist you? Please enter 'help' for a list of commands.");
			command = keyboard.nextLine().toLowerCase();
			
			if(!doCommand(command))
			{
				System.out.println(" That was not a valid command.");
				continue;
			}
			
			repeat = verifyRepeat(keyboard);
		}
		
	}
	
	public static boolean doCommand(String command)
	{
		switch(command)
		{
			case "help": case "h":
			{
				printCommands();
				break;
			}
			case "exit":
			{
				System.out.println("Good bye!");
				System.exit(0);
			}
			default:
			{
				System.out.println("That was not a valid command.");
				return false;
			}
		}
		
		return true;
	}
	
	public static void printCommands()
	{
		System.out.println("The following is a list of currently supported commands:");
		System.out.println("help, matCalc, save, exit");
	}
	
	public static boolean verifyRepeat(Scanner keyboard)
	{
		String answer;
		System.out.print("Would you like to run another calculation? (Y/N)");
		answer = keyboard.nextLine().toLowerCase();
		
		switch(answer)
		{
			case "yes":
				return true;
			case "no":
				return false;
			default:
			{
				System.out.println("Incorrect input.");
				return verifyRepeat(keyboard);
			}	
		}
	}
}
