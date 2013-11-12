import java.nio.file.*;

public class Material
{
	private String name;
	private int amount;
	
	//constructors
	public Material(){}
	
	public Material(String name, int amount)
	{
		this.name = name;
		this.amount = amount;
	}
	//print methods
	public String toString()
	{
		return name+": "+amount;
	}
	
	//save method
	/*
	 * public boolean save(Path target)
	
	{
		boolean isSuccessful;
		
		
		
		return isSuccessful;
	}
	*/
	
	//accessor methods
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	public int getAmount()
	{
		return amount;
	}
}
