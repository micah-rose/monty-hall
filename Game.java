* Author: Micah L
 * A09 - Final Project
 * Course: CSIS 1410
 **********************/

package a09;

public class Game 
{
	/**
	 * private fields for Door enum and prize images
	 */
	private Door door;
	private String prizeImage;
	
	/**
	 * Constructor to create doors, must have Door type from enum class
	 * @param d
	 */
	public Game(Door d)
	{
		door = d;
		
		switch(d)
		{
			case MONEY: prizeImage = "/a09/money.png"; break; 
			case GOAT: prizeImage = "/a09/billyg.png"; break; 
			case ZOMBIE: prizeImage = "/a09/zombie.png"; break; 
			case POOP: prizeImage = "/a09/poop.png"; break;
			case EGG: prizeImage = "/a09/rotten-egg.png"; break;
			case LAUNDRY: prizeImage = "/a09/laundry.png"; break;
			default: break;
		}
	}

	/**
	 * Getter for retrieving the prize image
	 * @return
	 */
	public String getPrizeImage() 
	{
		return prizeImage;
	}
	
	/**
	 * Getter for retrieving doors
	 * @return
	 */
	public Door getDoor()
	{
		return door;
	}
}