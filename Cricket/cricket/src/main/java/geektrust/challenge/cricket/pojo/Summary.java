/**
 * 
 */
package geektrust.challenge.cricket.pojo;

/**
 * @author Padmanabhan M
 *
 */
public class Summary {
	
	private Integer totalRuns;
	private String winningTeam;
	private Integer playerLeft;
	private Integer ballLeft;
	private Boolean isVictory;
	
	
	
	
	/**
	 * @return the isVictory
	 */
	public Boolean getIsVictory() {
		return isVictory;
	}
	/**
	 * @param isVictory the isVictory to set
	 */
	public void setIsVictory(Boolean isVictory) {
		this.isVictory = isVictory;
	}
	/**
	 * 
	 */
	public Summary() {
		super();
	}
	/**
	 * @param totalRuns
	 * @param winningTeam
	 * @param playerLeft
	 * @param ballLeft
	 */
	public Summary(Integer totalRuns, String winningTeam, Integer playerLeft, Integer ballLeft,Boolean isVictory) {
		super();
		this.totalRuns = totalRuns;
		this.winningTeam = winningTeam;
		this.playerLeft = playerLeft;
		this.ballLeft = ballLeft;
		this.isVictory = isVictory;
	}
	
	/**
	 * @param isVictory
	 */
	public Summary(Boolean isVictory) {
		super();
		this.isVictory = isVictory;
	}
	/**
	 * @return the winningTeam
	 */
	public String getWinningTeam() {
		return winningTeam;
	}
	/**
	 * @param winningTeam the winningTeam to set
	 */
	public void setWinningTeam(String winningTeam) {
		this.winningTeam = winningTeam;
	}
	/**
	 * @return the playerLeft
	 */
	public Integer getPlayerLeft() {
		return playerLeft;
	}
	/**
	 * @param playerLeft the playerLeft to set
	 */
	public void setPlayerLeft(Integer playerLeft) {
		this.playerLeft = playerLeft;
	}
	/**
	 * @return the ballLeft
	 */
	public Integer getBallLeft() {
		return ballLeft;
	}
	/**
	 * @param ballLeft the ballLeft to set
	 */
	public void setBallLeft(Integer ballLeft) {
		this.ballLeft = ballLeft;
	}
	/**
	 * @return the totalRuns
	 */
	public Integer getTotalRuns() {
		return totalRuns;
	}
	/**
	 * @param totalRuns the totalRuns to set
	 */
	public void setTotalRuns(Integer totalRuns) {
		this.totalRuns = totalRuns;
	}
	
	

}
