/**
 * 
 */
package gt.be.war.warproblem;

/** Lengaburu Individual Troop Strength
 * 
 * @author Padmanabhan M
 *
 */
public enum LengaburuTroopStrength {
	
	HORSE(100),ELEPHANT(50),TANK(10),SLING(5);
	
	private Integer strength;
	
	
	/** Private Constructor for setting constant values
	 * 
	 * @param strength
	 */
	private LengaburuTroopStrength(Integer strength) {
		this.strength = strength;
	}

	/**Return the strength of the army troop
	 * 
	 * @return the strength
	 */
	public Integer getStrength() {
		return strength;
	}
}
