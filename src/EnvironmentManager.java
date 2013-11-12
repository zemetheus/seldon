import java.io.IOException;
import java.nio.file.*;

public class EnvironmentManager
{
	public static Environment setUpEnvironment()
	{
		//working directory
		String wdir = System.getProperty("user.dir");
		
		//Paths for main folders
		Path users = Paths.get(wdir,"users");
		Path library = Paths.get(wdir,"library");
		Path materials = Paths.get(wdir,"materials");

		createDirIfNotExist(users);
		createDirIfNotExist(library);
		createDirIfNotExist(materials);
		
		System.out.println("File System is intact.");

		return new Environment(users,library,materials);
	}
	
	private static void createDirIfNotExist(Path target)
	{
		try
		{
			if(!checkFile(target))
			{
				System.out.println("Creating "+target.getFileName()+".");
				Files.createDirectory(target);
				System.out.println("Done.");
			}
		}
		catch(IOException e)
		{
			System.out.println("There was an error verifying the file system.");
			e.printStackTrace();
		}
	}
	
	public static boolean checkFile(Path target)
	{
		return Files.exists(target);
	}	
}
