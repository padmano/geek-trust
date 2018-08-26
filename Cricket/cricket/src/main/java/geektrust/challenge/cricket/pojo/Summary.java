/**
 * 
 */
package geektrust.challenge.cricket.pojo;

/** Summary for holding after match results
 * 
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
	public Summary(Integer totalRuns,Boolean isVictory) {
		super();
		this.totalRuns = totalRuns;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballLeft == null) ? 0 : ballLeft.hashCode());
		result = prime * result + ((isVictory == null) ? 0 : isVictory.hashCode());
		result = prime * result + ((playerLeft == null) ? 0 : playerLeft.hashCode());
		result = prime * result + ((totalRuns == null) ? 0 : totalRuns.hashCode());
		result = prime * result + ((winningTeam == null) ? 0 : winningTeam.hashCode());
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
		if (!(obj instanceof Summary)) {
			return false;
		}
		Summary other = (Summary) obj;
		if (ballLeft == null) {
			if (other.ballLeft != null) {
				return false;
			}
		} else if (!ballLeft.equals(other.ballLeft)) {
			return false;
		}
		if (isVictory == null) {
			if (other.isVictory != null) {
				return false;
			}
		} else if (!isVictory.equals(other.isVictory)) {
			return false;
		}
		if (playerLeft == null) {
			if (other.playerLeft != null) {
				return false;
			}
		} else if (!playerLeft.equals(other.playerLeft)) {
			return false;
		}
		if (totalRuns == null) {
			if (other.totalRuns != null) {
				return false;
			}
		} else if (!totalRuns.equals(other.totalRuns)) {
			return false;
		}
		if (winningTeam == null) {
			if (other.winningTeam != null) {
				return false;
			}
		} else if (!winningTeam.equals(other.winningTeam)) {
			return false;
		}
		return true;
	}
	
	

}
