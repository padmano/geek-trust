package geektrust.challenge.cricket;

import java.util.HashMap;
import java.util.Map;

import geektrust.challenge.cricket.Player.Player;

/**
 * Hello world!
 *
 */
public class PlayCricket 
{
    public static void main( String[] args )
    {
    	
    	/*Player player = new Player();*/
    	Map<Integer, Player> playerList = new HashMap<Integer, Player>();
    	
    	playerList = createPlayerList();
    	
        System.out.println( "Hello World!" );
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
		playerList.put(1, player1);
		
		Player player2 = new Player();
		player2.setName("N.S. Nodhi");
		player2.setDot(10);
		player2.setOneRun(40);
		player1.setTwoRuns(20);
		player2.setThreeRuns(5);
		player2.setFourRuns(10);
		player2.setFiveRuns(1);
		player2.setSixRuns(4);
		player2.setWicket(10);
		playerList.put(2, player2);
		
		Player player3 = new Player();
		player3.setName("R Rumrah");
		player3.setDot(20);
		player3.setOneRun(30);
		player1.setTwoRuns(15);
		player3.setThreeRuns(5);
		player3.setFourRuns(5);
		player3.setFiveRuns(1);
		player3.setSixRuns(4);
		player3.setWicket(20);
		playerList.put(3, player3);
		
		Player player4 = new Player();
		player4.setName("Shashi Henra");
		player4.setDot(30);
		player4.setOneRun(25);
		player1.setTwoRuns(5);
		player4.setThreeRuns(0);
		player4.setFourRuns(5);
		player4.setFiveRuns(1);
		player4.setSixRuns(4);
		player4.setWicket(30);
		playerList.put(3, player4);
		
		
		
		return playerList;
	}
}
