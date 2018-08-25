package geektrust.challenge.cricket;

import java.util.List;
import java.util.Map;

import geektrust.challenge.cricket.pojo.Commentary;
import geektrust.challenge.cricket.pojo.InningsResult;
import geektrust.challenge.cricket.pojo.MatchDetails;
import geektrust.challenge.cricket.pojo.Player;
import geektrust.challenge.cricket.simulator.InningsSimulatorImpl;
import geektrust.challenge.cricket.utils.CricketUtils;

/**
 * Let's Play Cricket
 *
 */
public class PlayCricket {

/*	private static final Logger logger = Logger.getLogger(PlayCricket.class.getName());*/

	public static void main(String[] args) {

		try {
			MatchDetails matchDetails = CricketUtils.createMatchDetails("match");
			Map<Integer, Player> players = CricketUtils.createPlayerList("player");

			InningsSimulatorImpl inningsSimulator = new InningsSimulatorImpl();

			if(matchDetails != null  && !players.isEmpty()){
				InningsResult inningsResult = inningsSimulator.simulateInningsAgainstTarget(players, matchDetails);

				
				List<Commentary> commentaryList = inningsResult.getCommentary();
				for ( int i = 0; i < commentaryList.size(); i ++) {
					
					if(commentaryList.get(i).getIsOverSummary()!=null && commentaryList.get(i).getIsOverSummary()) 
						System.out.println("\n"+commentaryList.get(i).getRemainingRun()+(commentaryList.get(i).getRemainingRun() > 1 ?" runs ": " run ")+ "needed. "+commentaryList.get(i).getRemainingOver() +(commentaryList.get(i).getRemainingOver() > 1 ? " overs ":" over ")+ "remaining.\n");
					else if(commentaryList.get(i).getIsOut()) 
						System.out.println((commentaryList.get(i).getBall()/6)+"."+(commentaryList.get(i).getBall()%6) +" " + commentaryList.get(i).getPlayer() +" is out.");
					else
						System.out.println((commentaryList.get(i).getBall()/6)+"."+(commentaryList.get(i).getBall()%6)+ " " +commentaryList.get(i).getPlayer() +" scores " + commentaryList.get(i).getRun()+(commentaryList.get(i).getRun() > 1 ?" runs.": " run."));
				}
				
				for( int i = 1; i <= inningsResult.getPlayerList().size(); i ++) {
					if(inningsResult.getPlayerList().containsKey(i))
						System.out.println("\n" +inningsResult.getPlayerList().get(i).getName() +" " +inningsResult.getPlayerList().get(i).getTotalRunsScored()+( inningsResult.getPlayerList().get(i).getIsOut() ?"":"*")+" ("+inningsResult.getPlayerList().get(i).getTotalBallsFaced()+")");
				}
				
				if(inningsResult.getSummary().getIsVictory() != null && inningsResult.getSummary().getIsVictory())
					System.out.print("\n"+inningsResult.getSummary().getWinningTeam()+ " won by " + inningsResult.getSummary().getPlayerLeft()+(inningsResult.getSummary().getPlayerLeft() > 1 ? " wickets": " wicket")+" and " + inningsResult.getSummary().getBallLeft() + (inningsResult.getSummary().getBallLeft() > 1 ? " balls": " ball")+" left.");
				else 
					System.out.println("\nLengaluru Lost");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
