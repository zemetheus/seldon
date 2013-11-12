import java.nio.file.Path;

public class Environment
{
	/*
	 * The purpose of the Environment Variable is to initialise, collect, and store information
	 * pertaining to the in/out functionality of Remembrall.
	 * 
	 * Specifically:
	 * Track the daily task folder
	 * Track the worksystem directory
	 * Maintain the integrity of the working filesystem
	 * 
	 */
	
	
	//Associated paths for environment navigation
	protected Path users;
	protected Path library;
	protected Path materials;
	
	//constructor
	public Environment(Path users, Path library, Path materials)
	{
		this.users = users;
		this.library = library;
		this.materials = materials;
	}
}
