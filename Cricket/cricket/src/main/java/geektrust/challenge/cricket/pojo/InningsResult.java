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
	

}
