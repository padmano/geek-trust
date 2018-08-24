/**
 * 
 */
package gt.be.war.warproblem;

/**
 * @author Padmanabhan M
 *
 */
public class TroopSubstitution {
	
	private Integer subValue;
	private String lower;
	private String higher;
	
	
	public TroopSubstitution(Integer subValue, String lower, String higher) {
		super();
		this.subValue = subValue;
		this.lower = lower;
		this.higher = higher;
	}
	/**
	 * @return the subValue
	 */
	public Integer getSubValue() {
		return subValue;
	}
	/**
	 * @param subValue the subValue to set
	 */
	public void setSubValue(Integer subValue) {
		this.subValue = subValue;
	}
	/**
	 * @return the lower
	 */
	public String getLower() {
		return lower;
	}
	/**
	 * @param lower the lower to set
	 */
	public void setLower(String lower) {
		this.lower = lower;
	}
	/**
	 * @return the higher
	 */
	public String getHigher() {
		return higher;
	}
	/**
	 * @param higher the higher to set
	 */
	public void setHigher(String higher) {
		this.higher = higher;
	}
}
