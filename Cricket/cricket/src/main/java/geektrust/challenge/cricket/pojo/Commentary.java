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


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ball == null) ? 0 : ball.hashCode());
		result = prime * result + ((isOut == null) ? 0 : isOut.hashCode());
		result = prime * result + ((isOverSummary == null) ? 0 : isOverSummary.hashCode());
		result = prime * result + ((player == null) ? 0 : player.hashCode());
		result = prime * result + ((remainingOver == null) ? 0 : remainingOver.hashCode());
		result = prime * result + ((remainingRun == null) ? 0 : remainingRun.hashCode());
		result = prime * result + ((run == null) ? 0 : run.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Commentary)) {
			return false;
		}
		Commentary other = (Commentary) obj;
		if (ball == null) {
			if (other.ball != null) {
				return false;
			}
		} else if (!ball.equals(other.ball)) {
			return false;
		}
		if (isOut == null) {
			if (other.isOut != null) {
				return false;
			}
		} else if (!isOut.equals(other.isOut)) {
			return false;
		}
		if (isOverSummary == null) {
			if (other.isOverSummary != null) {
				return false;
			}
		} else if (!isOverSummary.equals(other.isOverSummary)) {
			return false;
		}
		if (player == null) {
			if (other.player != null) {
				return false;
			}
		} else if (!player.equals(other.player)) {
			return false;
		}
		if (remainingOver == null) {
			if (other.remainingOver != null) {
				return false;
			}
		} else if (!remainingOver.equals(other.remainingOver)) {
			return false;
		}
		if (remainingRun == null) {
			if (other.remainingRun != null) {
				return false;
			}
		} else if (!remainingRun.equals(other.remainingRun)) {
			return false;
		}
		if (run == null) {
			if (other.run != null) {
				return false;
			}
		} else if (!run.equals(other.run)) {
			return false;
		}
		return true;
	}
	
	

}
