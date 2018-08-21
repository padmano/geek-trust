/**
 * 
 */
package geektrust.challenge.cricket.RunGenerator;

import geektrust.challenge.cricket.Player.PlayerProbability;

/**
 * @author Padmanabhan M
 *
 */
public class Runs extends PlayerProbability implements RunsGenerator {
	
	/* (non-Javadoc)
	 * @see geektrust.challenge.cricket.RunGenerator.RunsGenerator#generateRun()
	 */
	public Integer generateRun() {
		long a = ((System.currentTimeMillis() * 125) % 2796203) % 2;
		
		if (a == 1)
			toss = 1;
		else
			toss = 0;
		return null;
		
	}

	/**
	 * @return the scoreRuns
	 */
	public Integer getScoreRuns() {
		return this.generateRun();
	}



}
