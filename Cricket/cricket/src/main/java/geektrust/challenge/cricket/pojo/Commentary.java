/**
 * 
 */
package geektrust.challenge.cricket.pojo;

/**
 * @author Padmanabhan M
 *
 */
public class Commentary {
	
	private String player;
	private Integer ball;
	private Integer run;
	private Integer remainingRun;
	private Integer remainingOver;
	private Boolean isOverSummary;
	private Boolean isOut;
	
	
	/** Comment for over summary 
	 * @param player
	 * @param ball
	 * @param run
	 * @param remainingRun
	 * @param remainingOver
	 */
	public Commentary(Integer remainingRun, Integer remainingOver,Boolean isOverSummary) {
		super();
		this.isOverSummary = isOverSummary;
		this.remainingRun = remainingRun;
		this.remainingOver = remainingOver;
	}
	
	
	/**Scores run per ball with player name
	 * @param player
	 * @param ball
	 * @param run
	 */
	public Commentary(int ball,String player,  Integer run, Boolean isOut) {
		super();
		this.isOut = isOut;
		this.player = player;
		this.ball = ball;
		this.run = run;
	}
	/**
	 * @param player
	 * @param ball
	 * @param isOut
	 */
	public Commentary(String player, Integer ball, Boolean isOut) {
		super();
		this.player = player;
		this.ball = ball;
		this.isOut = isOut;
	}
	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(String player) {
		this.player = player;
	}
	/**
	 * @return the ball
	 */
	public Integer getBall() {
		return ball;
	}
	/**
	 * @param ball the ball to set
	 */
	public void setBall(Integer ball) {
		this.ball = ball;
	}
	/**
	 * @return the run
	 */
	public Integer getRun() {
		return run;
	}
	/**
	 * @param run the run to set
	 */
	public void setRun(Integer run) {
		this.run = run;
	}
	/**
	 * @return the remainingRun
	 */
	public Integer getRemainingRun() {
		return remainingRun;
	}
	/**
	 * @param remainingRun the remainingRun to set
	 */
	public void setRemainingRun(Integer remainingRun) {
		this.remainingRun = remainingRun;
	}
	/**
	 * @return the remainingOver
	 */
	public Integer getRemainingOver() {
		return remainingOver;
	}
	/**
	 * @param remainingOver the remainingOver to set
	 */
	public void setRemainingOver(Integer remainingOver) {
		this.remainingOver = remainingOver;
	}
	/**
	 * @return the isOverSummary
	 */
	public Boolean getIsOverSummary() {
		return isOverSummary;
	}
	/**
	 * @param isOverSummary the isOverSummary to set
	 */
	public void setIsOverSummary(Boolean isOverSummary) {
		this.isOverSummary = isOverSummary;
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
	
	

}
