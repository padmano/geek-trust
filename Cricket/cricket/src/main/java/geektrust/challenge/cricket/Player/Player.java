/**
 * 
 */
package geektrust.challenge.cricket.Player;

import geektrust.challenge.cricket.RunGenerator.Runs;

/**
 * @author Padmanabhan M
 *
 */
public class Player extends Runs{
	
	private String name;
	private String handedness;
	private String nature;
	
	/**
	 * 
	 */
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param handedness
	 * @param nature
	 */
	public Player(String name, String handedness, String nature) {
		super();
		this.name = name;
		this.handedness = handedness;
		this.nature = nature;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the handedness
	 */
	public String getHandedness() {
		return handedness;
	}
	/**
	 * @param handedness the handedness to set
	 */
	public void setHandedness(String handedness) {
		this.handedness = handedness;
	}
	/**
	 * @return the nature
	 */
	public String getNature() {
		return nature;
	}
	/**
	 * @param nature the nature to set
	 */
	public void setNature(String nature) {
		this.nature = nature;
	}
}
