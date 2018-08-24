/**
 * 
 */
package geektrust.challenge.cricket.simulator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import geektrust.challenge.cricket.pojo.Commentary;
import geektrust.challenge.cricket.pojo.InningsResult;
import geektrust.challenge.cricket.pojo.MatchDetails;
import geektrust.challenge.cricket.pojo.Player;
import geektrust.challenge.cricket.pojo.Summary;
import geektrust.challenge.cricket.utils.CricketUtils;

/**
 * @author Padmanabhan M
 *
 */
public class InningsSimulatorImpl implements InningsSimulator {

	/*
	 * Simulate an innings till last wicket/last ball/until target is achieved
	 * (non-Javadoc)
	 * 
	 * @see
	 * geektrust.challenge.cricket.simulator.InningsSimulator#simulateInnings(java.
	 * util.Map, geektrust.challenge.cricket.pojo.MatchDetails)
	 */
	public InningsResult simulateInningsAgainstTarget(Map<Integer, Player> players, MatchDetails matchDetails) {
		InningsResult result = new InningsResult();
		Commentary comment;
		List<Commentary> commentaryList = new ArrayList<Commentary>();
		Summary summary = new Summary();
		Map<Integer, Player> afterMatch = new HashMap<Integer, Player>();
		List<Player> swappedList;
		try {

			Integer targetRuns = matchDetails.getTargetRuns();
			Integer totalOvers = matchDetails.getTargetOvers();
			Integer balls = matchDetails.getBallsPerOver() * totalOvers;

			Player striker = players.get(1);
			Player nonStriker = players.get(2);
			Integer playerStrike = 2;

			Integer totalRuns = 0;

			Integer teamSize = players.size();

			Integer currentOver = 0;

			comment = new Commentary(targetRuns, totalOvers - currentOver, Boolean.TRUE); // Over Summary - start
			commentaryList.add(comment);
			for (int currentBall = 1; currentBall <= balls; currentBall++) {

				Integer currentRun = striker.scoreRun();

				striker.setTotalBallsFaced(striker.getTotalBallsFaced() + 1);

				if (currentRun > 0) {
					striker.setTotalRunsScored(striker.getTotalRunsScored() + currentRun);
					totalRuns = totalRuns + currentRun;
				}
				if (currentRun < 0) {
					
					comment = new Commentary(striker.getName(), currentBall, Boolean.TRUE); // Player is out
					commentaryList.add(comment);
					playerStrike++;
					striker.setIsOut(Boolean.TRUE);
					afterMatch.put(striker.getBattingOrder(), striker);
					if (currentBall % 6 == 0) {
						currentOver++;
						comment = new Commentary(targetRuns-totalRuns, totalOvers - currentOver, Boolean.TRUE); // Over Summary -
																										// wicket at the
																										// last ball of
																										// the over
						commentaryList.add(comment);
					}
					if (playerStrike  <= teamSize) {
						striker = players.get(playerStrike);
						continue;
					} else {
						afterMatch.put(nonStriker.getBattingOrder(), nonStriker);
						summary = new Summary(Boolean.FALSE);
						break;
					}
				}
				comment = new Commentary(currentBall, striker.getName(), currentRun, Boolean.FALSE);
				commentaryList.add(comment);

				if (totalRuns >= targetRuns) {
					summary = new Summary(totalRuns, "Lengaluru", (teamSize - playerStrike), (balls - currentBall),
							Boolean.TRUE);

					afterMatch.put(striker.getBattingOrder(), striker);
					afterMatch.put(nonStriker.getBattingOrder(), nonStriker);

					break;
				}

				if (currentRun % 2 == 1) {
					swappedList = CricketUtils.rotateStrike(striker, nonStriker);
					striker = swappedList.get(0);
					nonStriker = swappedList.get(1);
				}

				if (currentBall % 6 == 0) {
					
					currentOver++;

					comment = new Commentary(targetRuns - totalRuns, totalOvers - currentOver, Boolean.TRUE); // Over
																												// Summary
																												// - at
																												// the
																												// end
																												// of an
																												// over

					commentaryList.add(comment);
					swappedList = CricketUtils.rotateStrike(striker, nonStriker);
					striker = swappedList.get(0);
					nonStriker = swappedList.get(1);
				}
			}
			
			afterMatch.put(striker.getBattingOrder(), striker);
			afterMatch.put(nonStriker.getBattingOrder(), nonStriker);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		result.setCommentary(commentaryList);
		result.setPlayerList(afterMatch);
		result.setSummary(summary);
		return result;
	}

	/*
	 * Simulate an innings until last wicket standing or till last ball.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see
	 * geektrust.challenge.cricket.simulator.InningsSimulator#simulateInnings(java.
	 * util.Map, geektrust.challenge.cricket.pojo.MatchDetails)
	 */
	public InningsResult simulateInnings(Map<Integer, Player> players, MatchDetails matchDetails) {

		InningsResult inningsResult = new InningsResult();
		Commentary comment;
		List<Commentary> commentaryList = new ArrayList<Commentary>();
		Map<Integer, Player> playerList = new HashMap<Integer, Player>();

		Player striker = players.get(1);
		Player nonStriker = players.get(2);

		Integer playerDown = 2;
		Integer currentRun = 0;
		Integer totalRun = 0;

		Integer totalBalls = matchDetails.getBallsPerOver() * matchDetails.getTargetOvers();

		Integer teamSize = players.size();
		List<Player> swapPlayerList;
		for (int currentBall = 1; currentBall <= totalBalls; currentBall++) {

			currentRun = striker.scoreRun();

			striker.setTotalBallsFaced(striker.getTotalBallsFaced() + 1);

			comment = new Commentary(currentBall, striker.getName(), currentRun, Boolean.FALSE);

			if (currentRun > 0) {
				striker.setTotalRunsScored(striker.getTotalRunsScored() + currentRun);
				totalRun = totalRun + currentRun;
			}

			if ((currentRun % 2 == 1 || currentBall % 6 == 0) && !(currentRun % 2 == 1 && currentBall % 6 == 0)) {
				swapPlayerList = CricketUtils.rotateStrike(striker, nonStriker);
				striker = swapPlayerList.get(0);
				nonStriker = swapPlayerList.get(1);
			}

			if (currentRun < 0) {
				playerDown++;
				striker.setIsOut(Boolean.TRUE);
				playerList.put(striker.getBattingOrder(), striker);
				if (playerDown <= teamSize) {
					striker = players.get(playerDown);
				} else {
					playerList.put(striker.getBattingOrder(), striker);
					playerList.put(nonStriker.getBattingOrder(), nonStriker);
					break;
				}

			}
			commentaryList.add(comment);
		}

		inningsResult.setCommentary(commentaryList);
		inningsResult.setPlayerList(playerList);
		return inningsResult;
	}

}
