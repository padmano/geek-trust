/**
 * 
 */
package geektrust.challenge.cricket.pojo;

/**Pojo class for holding run wise probability of each player.
 * 
 * @author Padmanabhan M
 *
 */
public class PlayerProbability {
	
	private Integer dot;
	private Integer oneRun;
	private Integer twoRuns;
	private Integer threeRuns;
	private Integer fourRuns;
	private Integer fiveRuns;
	private Integer sixRuns;
	private Integer wicket;
	/**
	 * @return the dot
	 */
	public Integer getDot() {
		return dot;
	}
	/**
	 * @param dot the dot to set
	 */
	public void setDot(Integer dot) {
		this.dot = dot;
	}
	/**
	 * @return the oneRun
	 */
	public Integer getOneRun() {
		return oneRun;
	}
	/**
	 * @param oneRun the oneRun to set
	 */
	public void setOneRun(Integer oneRun) {
		this.oneRun = oneRun;
	}
	/**
	 * @return the twoRuns
	 */
	public Integer getTwoRuns() {
		return twoRuns;
	}
	/**
	 * @param twoRuns the twoRuns to set
	 */
	public void setTwoRuns(Integer twoRuns) {
		this.twoRuns = twoRuns;
	}
	/**
	 * @return the threeRuns
	 */
	public Integer getThreeRuns() {
		return threeRuns;
	}
	/**
	 * @param threeRuns the threeRuns to set
	 */
	public void setThreeRuns(Integer threeRuns) {
		this.threeRuns = threeRuns;
	}
	/**
	 * @return the fourRuns
	 */
	public Integer getFourRuns() {
		return fourRuns;
	}
	/**
	 * @param fourRuns the fourRuns to set
	 */
	public void setFourRuns(Integer fourRuns) {
		this.fourRuns = fourRuns;
	}
	/**
	 * @return the fiveRuns
	 */
	public Integer getFiveRuns() {
		return fiveRuns;
	}
	/**
	 * @param fiveRuns the fiveRuns to set
	 */
	public void setFiveRuns(Integer fiveRuns) {
		this.fiveRuns = fiveRuns;
	}
	/**
	 * @return the sixRuns
	 */
	public Integer getSixRuns() {
		return sixRuns;
	}
	/**
	 * @param sixRuns the sixRuns to set
	 */
	public void setSixRuns(Integer sixRuns) {
		this.sixRuns = sixRuns;
	}
	/**
	 * @return the wicket
	 */
	public Integer getWicket() {
		return wicket;
	}
	/**
	 * @param wicket the wicket to set
	 */
	public void setWicket(Integer wicket) {
		this.wicket = wicket;
	}
	/**
	 * @return
	 */
	public Integer generateRun() {
		return null;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dot == null) ? 0 : dot.hashCode());
		result = prime * result + ((fiveRuns == null) ? 0 : fiveRuns.hashCode());
		result = prime * result + ((fourRuns == null) ? 0 : fourRuns.hashCode());
		result = prime * result + ((oneRun == null) ? 0 : oneRun.hashCode());
		result = prime * result + ((sixRuns == null) ? 0 : sixRuns.hashCode());
		result = prime * result + ((threeRuns == null) ? 0 : threeRuns.hashCode());
		result = prime * result + ((twoRuns == null) ? 0 : twoRuns.hashCode());
		result = prime * result + ((wicket == null) ? 0 : wicket.hashCode());
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
		if (!(obj instanceof PlayerProbability)) {
			return false;
		}
		PlayerProbability other = (PlayerProbability) obj;
		if (dot == null) {
			if (other.dot != null) {
				return false;
			}
		} else if (!dot.equals(other.dot)) {
			return false;
		}
		if (fiveRuns == null) {
			if (other.fiveRuns != null) {
				return false;
			}
		} else if (!fiveRuns.equals(other.fiveRuns)) {
			return false;
		}
		if (fourRuns == null) {
			if (other.fourRuns != null) {
				return false;
			}
		} else if (!fourRuns.equals(other.fourRuns)) {
			return false;
		}
		if (oneRun == null) {
			if (other.oneRun != null) {
				return false;
			}
		} else if (!oneRun.equals(other.oneRun)) {
			return false;
		}
		if (sixRuns == null) {
			if (other.sixRuns != null) {
				return false;
			}
		} else if (!sixRuns.equals(other.sixRuns)) {
			return false;
		}
		if (threeRuns == null) {
			if (other.threeRuns != null) {
				return false;
			}
		} else if (!threeRuns.equals(other.threeRuns)) {
			return false;
		}
		if (twoRuns == null) {
			if (other.twoRuns != null) {
				return false;
			}
		} else if (!twoRuns.equals(other.twoRuns)) {
			return false;
		}
		if (wicket == null) {
			if (other.wicket != null) {
				return false;
			}
		} else if (!wicket.equals(other.wicket)) {
			return false;
		}
		return true;
	}
	
	
}
