/**
 * 
 */
package geektrust.challenge.cricket.pojo;

/**
 * @author Padmanabhan M
 *
 */
public class MatchDetails {

	private Integer targetRuns;
	private Integer targetOvers;
	private Integer ballsPerOver;
	/**
	 * @return the targetRuns
	 */
	public Integer getTargetRuns() {
		return targetRuns;
	}
	/**
	 * @param targetRuns the targetRuns to set
	 */
	public void setTargetRuns(Integer targetRuns) {
		this.targetRuns = targetRuns;
	}
	/**
	 * @return the targetOvers
	 */
	public Integer getTargetOvers() {
		return targetOvers;
	}
	/**
	 * @param targetOvers the targetOvers to set
	 */
	public void setTargetOvers(Integer targetOvers) {
		this.targetOvers = targetOvers;
	}
	/**
	 * @return the ballsPerOver
	 */
	public Integer getBallsPerOver() {
		return ballsPerOver;
	}
	/**
	 * @param ballsPerOver the ballsPerOver to set
	 */
	public void setBallsPerOver(Integer ballsPerOver) {
		this.ballsPerOver = ballsPerOver;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ballsPerOver == null) ? 0 : ballsPerOver.hashCode());
		result = prime * result + ((targetOvers == null) ? 0 : targetOvers.hashCode());
		result = prime * result + ((targetRuns == null) ? 0 : targetRuns.hashCode());
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
		if (!(obj instanceof MatchDetails)) {
			return false;
		}
		MatchDetails other = (MatchDetails) obj;
		if (ballsPerOver == null) {
			if (other.ballsPerOver != null) {
				return false;
			}
		} else if (!ballsPerOver.equals(other.ballsPerOver)) {
			return false;
		}
		if (targetOvers == null) {
			if (other.targetOvers != null) {
				return false;
			}
		} else if (!targetOvers.equals(other.targetOvers)) {
			return false;
		}
		if (targetRuns == null) {
			if (other.targetRuns != null) {
				return false;
			}
		} else if (!targetRuns.equals(other.targetRuns)) {
			return false;
		}
		return true;
	}
	
	
}
