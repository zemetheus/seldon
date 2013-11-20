import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String username;
		Environment environment;
		Repeater repeater = new Repeater();
		
		System.out.print("Username:");
		username = keyboard.nextLine();
		//System.out.print("Password");
		
		System.out.println("Welcome, "+username+"! Please wait while I check the filesystem integrity.");
		
		environment = EnvironmentManager.setUpEnvironment();
		
		//command loop
		while(repeater.verifyRepeat(keyboard))
		{
			doCommand(keyboard);
		}
		
	}
	
	public static String getCommand(Scanner keyboard)
	{
		String command;
		
		System.out.println("Enter your command. Enter 'help' for a list of commands.");
		command = keyboard.nextLine().toLowerCase();
		
		return command;
	}
	
	public static void doCommand(Scanner keyboard)
	{
		while(true)
		{
			switch(getCommand(keyboard))
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
				}
			}
		}
	}
	
	public static void printCommands()
	{
		System.out.println("The following is a list of currently supported commands:");
		System.out.println("help, matCalc, save, exit");
	}
}
