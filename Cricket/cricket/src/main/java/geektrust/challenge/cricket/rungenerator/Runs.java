/**
 * 
 */
package geektrust.challenge.cricket.rungenerator;

import geektrust.challenge.cricket.pojo.PlayerProbability;

/**Pojo for implementing run generator
 * 
 * @author Padmanabhan M
 *
 */
public class Runs extends PlayerProbability implements RunsGenerator  {
	
	/* (non-Javadoc)
	 * @see geektrust.challenge.cricket.RunGenerator.RunsGenerator#generateRun()
	 */
	@Override
	public Integer generateRun() {
		
		
		Integer dotProb = getDot();
		Integer oneProb = getDot() + getOneRun();
		Integer twoProb = getDot() + getOneRun()+ getTwoRuns();
		Integer threeProb = getDot() + getOneRun()+ getTwoRuns() + getThreeRuns();
		Integer fourProb = getDot() + getOneRun()+ getTwoRuns() + getThreeRuns() + getFourRuns();
		Integer fiveProb = getDot() + getOneRun()+ getTwoRuns() + getThreeRuns() + getFourRuns() + getFiveRuns();
		Integer sixProb = getDot() + getOneRun()+ getTwoRuns() + getThreeRuns() + getFourRuns() + getFiveRuns() + getSixRuns();
		Integer wicketProb = getDot() + getOneRun()+ getTwoRuns() + getThreeRuns() + getFourRuns() + getFiveRuns() + getSixRuns() + getWicket();
		
		long a = ((System.nanoTime() * 125) % 2796203) % wicketProb;
		
		if( a <= dotProb)
			return 0;
		else if( a <= oneProb)
			return 1;
		else if( a <= twoProb)
			return 2;
		else if( a <= threeProb)
			return 3;
		else if( a <= fourProb)
			return 4;
		else if( a <= fiveProb)
			return 5;
		else if( a <= sixProb)
			return 6;
		else if( a <= wicketProb)
			return -1;
		
		return 0;
	}

	/**
	 * @return the scoreRuns
	 */
	public Integer scoreRun() {
		return this.generateRun();
	}



}
