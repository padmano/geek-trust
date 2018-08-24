/**
 * 
 */
package geektrust.challenge.cricket.simulator;

import java.util.Map;

import geektrust.challenge.cricket.pojo.InningsResult;
import geektrust.challenge.cricket.pojo.MatchDetails;
import geektrust.challenge.cricket.pojo.Player;

/**
 * @author Padmanabhan M
 *
 */
public interface InningsSimulator {

	/** Simulate an innings until last man standing or running out of balls.
	 * @param players
	 * @param matchDetails
	 * @return
	 */
	public InningsResult simulateInnings(Map<Integer, Player> players, MatchDetails matchDetails);
	
	/**Simulate an innings until last man standing or running out of balls or when the target is reached.
	 * @param players
	 * @param matchDetails
	 * @return
	 */
	public InningsResult simulateInningsAgainstTarget(Map<Integer, Player> players, MatchDetails matchDetails);
}
