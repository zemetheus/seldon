import java.util.ArrayList;

public class Blueprint
{
	String name;
	ArrayList<Material> billOfMaterials;
	
	/**
	 * default constructor
	 */
	public Blueprint(){}
	
	public Blueprint(String name, ArrayList<Material> billOfMaterials)
	{
		this.name = name;
		this.billOfMaterials = billOfMaterials;
	}
	
	public void setBillOfMaterials(ArrayList<Material> billOfMaterials)
	{
		this.billOfMaterials = billOfMaterials;
	}
	
	public ArrayList<Material> getBillOfMaterials()
	{
		return billOfMaterials;
	}
}
