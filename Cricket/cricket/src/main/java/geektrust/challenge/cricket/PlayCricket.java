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
 * Let's Play Cricket :-)
 *
 */
public class PlayCricket {


	/** Main Method for staring the game
	 * 
	 * Data for each problem is loaded from the JSON file places under resources. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		InningsSimulatorImpl inningsSimulator = new InningsSimulatorImpl();
		
		
		/* Problem 1: The last FOUR - Start*/
		
		
		/*try {
			MatchDetails matchDetails = CricketUtils.createMatchDetails("match");
			Map<Integer, Player> players = CricketUtils.createPlayerList("player");

			

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
		}*/
		
		
		/* Problem 1: The last FOUR - END*/
		
		
		/* Problem 2: The tie breaker - Start*/
		
		try {
			
			MatchDetails matchDetails = CricketUtils.createMatchDetails("super-over-match");
			Map<Integer, Player> lengaburuPlayers = CricketUtils.createPlayerList("Lengaburu");
			
			InningsResult lenInningsResult = inningsSimulator.simulateInnings(lengaburuPlayers, matchDetails);
			
			List<Commentary> commentaryList = lenInningsResult.getCommentary();
			Integer lenWicket = 0;
			System.out.println("Lengaluru Innings\n");
			for ( int i = 0; i < commentaryList.size(); i ++) {
				if(commentaryList.get(i).getIsOverSummary()!=null && commentaryList.get(i).getIsOverSummary()) 
					System.out.println("\n"+commentaryList.get(i).getRemainingRun()+(commentaryList.get(i).getRemainingRun() > 1 ?" runs ": " run ")+ "needed. "+commentaryList.get(i).getRemainingOver() +(commentaryList.get(i).getRemainingOver() > 1 ? " overs ":" over ")+ "remaining.\n");
				else if(commentaryList.get(i).getIsOut()){
					lenWicket ++;
					System.out.println((commentaryList.get(i).getBall()/6)+"."+(commentaryList.get(i).getBall()%6) +" " + commentaryList.get(i).getPlayer() +" is out.");
				}
					
				else
					System.out.println((commentaryList.get(i).getBall()/6)+"."+(commentaryList.get(i).getBall()%6)+ " " +commentaryList.get(i).getPlayer() +" scores " + commentaryList.get(i).getRun()+(commentaryList.get(i).getRun() > 1 ?" runs.": " run."));
			}
			System.out.println("\nLengaluru Final Score: "+lenInningsResult.getSummary().getTotalRuns()+" - "+lenWicket);
			
			matchDetails.setTargetRuns(lenInningsResult.getSummary().getTotalRuns());
			
			
			Map<Integer, Player> enchaiPlayers = CricketUtils.createPlayerList("Enchai");
			
			InningsResult enInningsResult = inningsSimulator.simulateInningsAgainstTarget(enchaiPlayers, matchDetails);
			
			
			List<Commentary> enCommentaryList = enInningsResult.getCommentary();
			Integer enWicket = 0;
			
			System.out.println("\nEnchai Innings");
			
			for ( int i = 0; i < enCommentaryList.size(); i ++) {
				if(enCommentaryList.get(i).getIsOverSummary()!=null && enCommentaryList.get(i).getIsOverSummary()) 
					System.out.println("\n"+enCommentaryList.get(i).getRemainingRun()+(enCommentaryList.get(i).getRemainingRun() > 1 ?" runs ": " run ")+ "needed. "+enCommentaryList.get(i).getRemainingOver() +(enCommentaryList.get(i).getRemainingOver() > 1 ? " overs ":" over ")+ "remaining.\n");
				else if(enCommentaryList.get(i).getIsOut()) {
					enWicket++;
					System.out.println((enCommentaryList.get(i).getBall()/6)+"."+(enCommentaryList.get(i).getBall()%6) +" " + enCommentaryList.get(i).getPlayer() +" is out.");
				}
					
				else
					System.out.println((enCommentaryList.get(i).getBall()/6)+"."+(enCommentaryList.get(i).getBall()%6)+ " " +enCommentaryList.get(i).getPlayer() +" scores " + enCommentaryList.get(i).getRun()+(enCommentaryList.get(i).getRun() > 1 ?" runs.": " run."));
			}
			
			System.out.println("\nEnchai Final Score: "+enInningsResult.getSummary().getTotalRuns()+" - "+enWicket);
			
			if(lenInningsResult.getSummary().getTotalRuns() > enInningsResult.getSummary().getTotalRuns()) 
				System.out.println("\nLengaburu won");
			else if(lenInningsResult.getSummary().getTotalRuns() < enInningsResult.getSummary().getTotalRuns())
				System.out.println("\nEnchai won");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		/* Problem 2: The tie breaker - END */
	}
}
