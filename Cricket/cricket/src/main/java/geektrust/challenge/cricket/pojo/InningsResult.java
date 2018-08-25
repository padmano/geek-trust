/**
 * 
 */
package geektrust.challenge.cricket.pojo;

import java.util.List;
import java.util.Map;

/**
 * @author Padmanabhan M
 *
 */
public class InningsResult {
	
	private Map<Integer,Player> playerList;
	private List<Commentary> commentary;
	private Summary summary;
	/**
	 * @return the commentary
	 */
	public List<Commentary> getCommentary() {
		return commentary;
	}
	/**
	 * @param commentary the commentary to set
	 */
	public void setCommentary(List<Commentary> commentary) {
		this.commentary = commentary;
	}
	/**
	 * @return the summary
	 */
	public Summary getSummary() {
		return summary;
	}
	/**
	 * @param summary the summary to set
	 */
	public void setSummary(Summary summary) {
		this.summary = summary;
	}
	/**
	 * @return the playerList
	 */
	public Map<Integer, Player> getPlayerList() {
		return playerList;
	}
	/**
	 * @param playerList the playerList to set
	 */
	public void setPlayerList(Map<Integer, Player> playerList) {
		this.playerList = playerList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((commentary == null) ? 0 : commentary.hashCode());
		result = prime * result + ((playerList == null) ? 0 : playerList.hashCode());
		result = prime * result + ((summary == null) ? 0 : summary.hashCode());
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
		if (!(obj instanceof InningsResult)) {
			return false;
		}
		InningsResult other = (InningsResult) obj;
		if (commentary == null) {
			if (other.commentary != null) {
				return false;
			}
		} else if (!commentary.equals(other.commentary)) {
			return false;
		}
		if (playerList == null) {
			if (other.playerList != null) {
				return false;
			}
		} else if (!playerList.equals(other.playerList)) {
			return false;
		}
		if (summary == null) {
			if (other.summary != null) {
				return false;
			}
		} else if (!summary.equals(other.summary)) {
			return false;
		}
		return true;
	}
	

}
