/**
 * 
 */
package geektrust.challenge.cricket.utils;

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
	/**
	 * @param player
	 * @param ball
	 * @param run
	 * @param remainingRun
	 * @param remainingOver
	 */
	public Commentary(Integer ball, String player,  Integer run, Integer remainingRun, Integer remainingOver) {
		super();
		this.player = player;
		this.ball = ball;
		this.run = run;
		this.remainingRun = remainingRun;
		this.remainingOver = remainingOver;
	}
	/**
	 * @param player
	 * @param ball
	 * @param run
	 */
	public Commentary(int ball,String player,  Integer run) {
		super();
		this.player = player;
		this.ball = ball;
		this.run = run;
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
	
	

}
