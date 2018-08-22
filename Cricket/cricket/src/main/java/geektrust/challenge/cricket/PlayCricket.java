package geektrust.challenge.cricket;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import geektrust.challenge.cricket.player.Player;
import geektrust.challenge.cricket.utils.Commentary;

/**
 * Let's Play Cricket
 *
 */
public class PlayCricket {
	public static void main(String[] args) {

		Integer targetRuns = 40;
		Integer totalOvers = 4;
		Integer balls = 6 * totalOvers;

		Map<Integer, Player> playerList = createPlayerList();

		Player striker = playerList.get(1);
		Player nonStriker = playerList.get(2);
		Integer playerStrike = 3;

		Integer totalRuns = 0;

		Integer teamSize = playerList.size();

		Integer currentOver = 0;

		List<Commentary> commentaryList = new ArrayList<Commentary>();
		List<Player> afterMatch = new ArrayList<Player>();
		System.out.println(totalOvers + " overs left. " + targetRuns + " runs to win.\n");
		for (int currentBall = 1; currentBall <= balls; currentBall++) {

			Integer currentRun = striker.scoreRun();

			if (currentRun < 0) {
				System.out.println(currentOver + "." + (currentBall % 6 == 0 ? 6 : (currentBall % 6)) + " "
						+ striker.getName() + " is out.");
				striker.setIsOut(Boolean.TRUE);
				afterMatch.add(striker);
				if (playerStrike > teamSize) {
					afterMatch.add(nonStriker);
					break;}
				striker = playerList.get(playerStrike);
				playerStrike++;
				continue;
			}

			striker.setTotalBallsFaced(currentBall);

			striker.setTotalRunsScored(striker.getTotalRunsScored() + 1);
			totalRuns = totalRuns + currentRun;
			/*
			 * Commentary newCommentary = new
			 * Commentary(currentBall,striker.getName(),currentRun);
			 * 
			 * commentaryList.add(newCommentary);
			 */

			System.out.println(currentOver + "." + (currentBall % 6 == 0 ? 6 : (currentBall % 6))+ " " + striker.getName() + " scores " + currentRun
					+ " " + (currentRun > 1 ? "runs" : "run."));
			if (totalRuns >= targetRuns) {
				afterMatch.add(striker);
				afterMatch.add(nonStriker);
				System.out.println("Win");
				break;
			}

			if (currentRun % 2 == 1) {
				List<Player> swappedList = new ArrayList<Player>();
				swappedList = swapPlayer(striker, nonStriker);
				striker = swappedList.get(0);
				nonStriker = swappedList.get(1);
			}

			if (currentBall % 6 == 0) {
				List<Player> swappedList = new ArrayList<Player>();
				currentOver++;
				System.out.println("\n" + (totalOvers - currentOver) + ((totalOvers - currentOver) > 1 ? " overs":" over" ) + " left. " +  (targetRuns - totalRuns) + ((targetRuns - totalRuns) > 1 ? " runs" : " run")
						+ " to win.\n");
				swappedList = swapPlayer(striker, nonStriker);
				striker = swappedList.get(0);
				nonStriker = swappedList.get(1);
			}
		}
		if(totalRuns < targetRuns) {
			System.out.println("Lose");
		}
		
		for(int i = 0; i < afterMatch.size(); i ++) {
			Player player = afterMatch.get(i);
			System.out.println(player.getName() + " " + player.getTotalRunsScored() +(player.getIsOut() ? "":"*")+"("+player.getTotalBallsFaced()+")");
		}
	}

	/**
	 * @param striker
	 * @param nonStriker
	 */
	private static List<Player> swapPlayer(Player striker, Player nonStriker) {
		List<Player> playerList = new ArrayList<Player>();
		Player temp = nonStriker;
		nonStriker = striker;
		striker = temp;
		playerList.add(striker);
		playerList.add(nonStriker);
		return playerList;
	}

	/**
	 * @return
	 */
	private static Map<Integer, Player> createPlayerList() {

		Map<Integer, Player> playerList = new HashMap<Integer, Player>();

		Player player1 = new Player();
		player1.setName("Kirat Boli");
		player1.setDot(5);
		player1.setOneRun(30);
		player1.setTwoRuns(25);
		player1.setThreeRuns(10);
		player1.setFourRuns(15);
		player1.setFiveRuns(1);
		player1.setSixRuns(9);
		player1.setWicket(5);
		player1.setTotalBallsFaced(0);
		player1.setTotalRunsScored(0);
		player1.setIsOut(Boolean.FALSE);
		playerList.put(1, player1);

		Player player2 = new Player();
		player2.setName("N.S. Nodhi");
		player2.setDot(10);
		player2.setOneRun(40);
		player2.setTwoRuns(20);
		player2.setThreeRuns(5);
		player2.setFourRuns(10);
		player2.setFiveRuns(1);
		player2.setSixRuns(4);
		player2.setWicket(10);
		player2.setTotalBallsFaced(0);
		player2.setTotalRunsScored(0);
		player2.setIsOut(Boolean.FALSE);
		playerList.put(2, player2);

		Player player3 = new Player();
		player3.setName("R Rumrah");
		player3.setDot(20);
		player3.setOneRun(30);
		player3.setTwoRuns(15);
		player3.setThreeRuns(5);
		player3.setFourRuns(5);
		player3.setFiveRuns(1);
		player3.setSixRuns(4);
		player3.setWicket(20);
		player3.setTotalBallsFaced(0);
		player3.setTotalRunsScored(0);
		player3.setIsOut(Boolean.FALSE);
		playerList.put(3, player3);

		Player player4 = new Player();
		player4.setName("Shashi Henra");
		player4.setDot(30);
		player4.setOneRun(25);
		player4.setTwoRuns(5);
		player4.setThreeRuns(0);
		player4.setFourRuns(5);
		player4.setFiveRuns(1);
		player4.setSixRuns(4);
		player4.setWicket(30);
		player4.setTotalBallsFaced(0);
		player4.setTotalRunsScored(0);
		player4.setIsOut(Boolean.FALSE);
		playerList.put(4, player4);

		return playerList;
	}
}
