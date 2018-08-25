/**
 * 
 */
package geektrust.challenge.cricket.pojo;

import geektrust.challenge.cricket.rungenerator.Runs;

/**
 * @author Padmanabhan M
 *
 */
public class Player extends Runs{
	
	private String name;
	private String handedness;
	private String nature;
	
	private Integer totalBallsFaced;
	private Integer totalRunsScored;
	
	private Boolean isOut;
	
	private Integer battingOrder;
	
	/**
	 * 
	 */
	public Player() {
		super();
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
	/**
	 * @return the totalBallsFaced
	 */
	public Integer getTotalBallsFaced() {
		return totalBallsFaced;
	}
	/**
	 * @param totalBallsFaced the totalBallsFaced to set
	 */
	public void setTotalBallsFaced(Integer totalBallsFaced) {
		this.totalBallsFaced = totalBallsFaced;
	}
	/**
	 * @return the totalRunsScored
	 */
	public Integer getTotalRunsScored() {
		return totalRunsScored;
	}
	/**
	 * @param totalRunsScored the totalRunsScored to set
	 */
	public void setTotalRunsScored(Integer totalRunsScored) {
		this.totalRunsScored = totalRunsScored;
	}
	/**
	 * @return the isOut
	 */
	public Boolean getIsOut() {
		return isOut;
	}
	/**
	 * @param isOut the isOut to set
	 */
	public void setIsOut(Boolean isOut) {
		this.isOut = isOut;
	}
	/**
	 * @return the battingOrder
	 */
	public Integer getBattingOrder() {
		return battingOrder;
	}
	/**
	 * @param battingOrder the battingOrder to set
	 */
	public void setBattingOrder(Integer battingOrder) {
		this.battingOrder = battingOrder;
	}
	
	
}
