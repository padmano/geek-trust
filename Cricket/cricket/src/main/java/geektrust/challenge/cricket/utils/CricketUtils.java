/**
 * 
 */
package geektrust.challenge.cricket.utils;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import geektrust.challenge.cricket.exception.FieldNotPresentException;
import geektrust.challenge.cricket.pojo.MatchDetails;
import geektrust.challenge.cricket.pojo.Player;

/**Cricket utility for creating player list and match details.
 * 
 * @author Padmanabhan M
 *
 */
public class CricketUtils {

	private static final Logger logger = Logger.getLogger(CricketUtils.class.getName());

	/**
	 * 
	 */
	private CricketUtils() {
		super();
	}

	/**
	 * Create the PlayerList from JSON file
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public static Map<Integer, Player> createPlayerList(String fileName)
			throws FileNotFoundException, FieldNotPresentException {

		Map<Integer, Player> playerList = new HashMap<Integer, Player>();

		try {
			JSONObject playerListJSONObj = readFromJSONFile(fileName);

			if (playerListJSONObj != null) {
				if (playerListJSONObj.containsKey("players"))

				{
					JSONArray playerArray = (JSONArray) playerListJSONObj.get("players");
					for (Object playerObj : playerArray) {

						JSONObject playerJSONObj = (JSONObject) playerObj;
						Player player = new Player();

						player.setName((String) playerJSONObj.get("name"));
						player.setHandedness((String) playerJSONObj.get("handedness"));
						player.setNature((String) playerJSONObj.get("nature"));
						player.setBattingOrder(((Long) playerJSONObj.get("battingOrder")).intValue());
						JSONObject probJSONObj = (JSONObject) playerJSONObj.get("probability");
						player.setDot(((Long) probJSONObj.get("dot")).intValue());
						player.setOneRun(((Long) probJSONObj.get("one")).intValue());
						player.setTwoRuns(((Long) probJSONObj.get("two")).intValue());
						player.setThreeRuns(((Long) probJSONObj.get("three")).intValue());
						player.setFourRuns(((Long) probJSONObj.get("four")).intValue());
						player.setFiveRuns(((Long) probJSONObj.get("five")).intValue());
						player.setSixRuns(((Long) probJSONObj.get("six")).intValue());
						player.setWicket(((Long) (probJSONObj.get("wicket"))).intValue());

						player.setTotalBallsFaced(0);
						player.setTotalRunsScored(0);
						player.setIsOut(Boolean.FALSE);

						playerList.put(player.getBattingOrder(), player);
					}
				} else
					throw new FieldNotPresentException();
			} else
				throw new FileNotFoundException();

		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

		/*
		 * Player player1 = new Player(); player1.setName("Kirat Boli");
		 * player1.setDot(5); player1.setOneRun(30); player1.setTwoRuns(25);
		 * player1.setThreeRuns(10); player1.setFourRuns(15); player1.setFiveRuns(1);
		 * player1.setSixRuns(9); player1.setWicket(5); player1.setTotalBallsFaced(0);
		 * player1.setTotalRunsScored(0); player1.setIsOut(Boolean.FALSE);
		 * playerList.put(1, player1);
		 * 
		 * Player player2 = new Player(); player2.setName("N.S. Nodhi");
		 * player2.setDot(10); player2.setOneRun(40); player2.setTwoRuns(20);
		 * player2.setThreeRuns(5); player2.setFourRuns(10); player2.setFiveRuns(1);
		 * player2.setSixRuns(4); player2.setWicket(10); player2.setTotalBallsFaced(0);
		 * player2.setTotalRunsScored(0); player2.setIsOut(Boolean.FALSE);
		 * playerList.put(2, player2);
		 * 
		 * Player player3 = new Player(); player3.setName("R Rumrah");
		 * player3.setDot(20); player3.setOneRun(30); player3.setTwoRuns(15);
		 * player3.setThreeRuns(5); player3.setFourRuns(5); player3.setFiveRuns(1);
		 * player3.setSixRuns(4); player3.setWicket(20); player3.setTotalBallsFaced(0);
		 * player3.setTotalRunsScored(0); player3.setIsOut(Boolean.FALSE);
		 * playerList.put(3, player3);
		 * 
		 * Player player4 = new Player(); player4.setName("Shashi Henra");
		 * player4.setDot(30); player4.setOneRun(25); player4.setTwoRuns(5);
		 * player4.setThreeRuns(0); player4.setFourRuns(5); player4.setFiveRuns(1);
		 * player4.setSixRuns(4); player4.setWicket(30); player4.setTotalBallsFaced(0);
		 * player4.setTotalRunsScored(0); player4.setIsOut(Boolean.FALSE);
		 * playerList.put(4, player4);
		 */

		return playerList;
	}

	/**
	 * Create the PlayerList from JSON file
	 * 
	 * @param fileName
	 * @return MatchDetails
	 * @throws FileNotFoundException
	 */
	public static MatchDetails createMatchDetails(String fileName)
			throws FileNotFoundException, FieldNotPresentException {
		MatchDetails matchDetail = new MatchDetails();
		try {
			JSONObject matchJSONObj = readFromJSONFile(fileName);
			if (matchJSONObj != null) {
				if (matchJSONObj.containsKey("matchDetails")) {
					JSONObject detailJSONObj = (JSONObject) matchJSONObj.get("matchDetails");
					if (detailJSONObj.containsKey("targetRuns"))
						matchDetail.setTargetRuns(((Long) detailJSONObj.get("targetRuns")).intValue());
					if (detailJSONObj.containsKey("targetOvers"))
						matchDetail.setTargetOvers(((Long) detailJSONObj.get("targetOvers")).intValue());
					if (detailJSONObj.containsKey("ballsPerOver"))
						matchDetail.setBallsPerOver(((Long) detailJSONObj.get("ballsPerOver")).intValue());
				} else
					throw new FieldNotPresentException("Required Field not Present");
			} else
				throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

		return matchDetail;
	}

	/**
	 * Rotate the strike at the end of the over or scores a 1/3/5
	 * 
	 * @param striker
	 * @param nonStriker
	 */
	public static List<Player> rotateStrike(Player striker, Player nonStriker) {
		List<Player> playerList = new ArrayList<Player>();
		if (striker != null && nonStriker != null) {
			Player temp = nonStriker;
			nonStriker = striker;
			striker = temp;
			playerList.add(striker);
			playerList.add(nonStriker);

		}
		return playerList;
	}

	/**
	 * Private method to read json file and parse as JSONObject
	 * 
	 * @param fileName
	 * @return JSONObject
	 * @throws FileNotFoundException
	 */
	private static JSONObject readFromJSONFile(String fileName) throws FileNotFoundException {
		JSONParser parser = new JSONParser();
		Object obj = null;
		ClassLoader classLoader = CricketUtils.class.getClassLoader();
		InputStream sam = classLoader.getResourceAsStream(fileName + ".json");
		if (sam != null)
			try {
				obj = parser.parse(new InputStreamReader(sam));

			} catch (Exception e) {
				logger.log(Level.SEVERE, "Exception in readFromJSONFile");
			}
		else
			throw new FileNotFoundException();
		return (JSONObject) obj;
	}
}
