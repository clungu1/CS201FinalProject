/* 
 * Cosmin Lungu
 * CS 201 - 01
 * Final Project
 * working with Matt Montequin
 */

package MainPack;

public class Food extends Product{

	//instance variables
	private String name;
	//tax = 1.25;
	private int quality;
	
	//default constructor
	public Food()
	{
		super(0,0.0,-1);
		name = "no name";
		quality = 0;
	}
	
	//usual constructor
	public Food(int b, double p, String n,Manufacturer m, int q)
	{
		super(b,p,1.25);
		name = n;
		//manufacturer
		quality = q;
	}
	
	//set the name
	public void setName(String n)
	{
		name = n;
	}
	
	//set the quality
	public void setQuality(int q)
	{
		quality = q;
	}
	
	//get the name
	public String getName()
	{
		return name;
	}
	
	// get the quality
	public int getQuality()
	{
		return quality;
	}
	
	//put everything in a string
	public String toString()
	{
		return super.toString()
				+ " | name: " + name
				+ " | quality: " + quality;
	}
	
	//see if one Food is equal to another
	public boolean equals(Food f)
	{
		return super.equals(f) 
				&& this.name == f.name
				&& this.quality == f.quality;
	}
}
