/**
 * 
 */
package geektrust.challenge.cricket;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.FileNotFoundException;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import geektrust.challenge.cricket.exception.FieldNotPresentException;
import geektrust.challenge.cricket.pojo.MatchDetails;
import geektrust.challenge.cricket.pojo.Player;
import geektrust.challenge.cricket.utils.CricketUtils;

/**
 * @author Padmanabhan M
 *
 */
public class CricketUtilsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createPlayerList(java.lang.String)}.
	 * 
	 * @throws FileNotFoundException
	 * @throws FieldNotPresentException 
	 */
	@Test
	public void testCreatePlayerListForSize() throws FileNotFoundException, FieldNotPresentException {
		String fileName = "player";
		Map<Integer, Player> playerList = PlayCricketTest.players; 

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
		player1.setBattingOrder(1);
		playerList.put(player1.getBattingOrder(), player1);

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
		player2.setBattingOrder(2);
		playerList.put(player2.getBattingOrder(), player2);

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
		player3.setBattingOrder(3);
		playerList.put(player3.getBattingOrder(), player3);
//		  playerList.put(3, player3);

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
		player4.setBattingOrder(4);
		playerList.put(player4.getBattingOrder(), player4);
//		  playerList.put(4, player4);

		
		  //All passed / true
		  
		  //1. Test equal, ignore order assertThat(map, is(expected));
		  
		  //2. Test size assertThat(map.size(), is(4));
		  
		  //3. Test map entry, best! assertThat(map, IsMapContaining.hasEntry("n", "node"));
		  
//		  assertThat(map, not(IsMapContaining.hasEntry("r", "ruby")));
		  
		  //4. Test map key assertThat(map, IsMapContaining.hasKey("j"));
		  
		  //5. Test map value assertThat(map, IsMapContaining.hasValue("node"));
		 
		
		 /* assertThat(playerList,
		  IsMapContaining.ha(CricketUtils.createPlayerList(fileName)));*/
		 
			assertThat(CricketUtils.createPlayerList(fileName).size(), is(playerList.size()));
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createPlayerList(java.lang.String)}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void testCreatePlayerListForAKey() throws FileNotFoundException {
		String fileName = "player";
		try {
			assertThat(CricketUtils.createPlayerList(fileName), IsMapContaining.hasKey(1));
		} catch (FieldNotPresentException e) {
			fail("testCreatePlayerListForAKey failed with FieldNotPresentException");
			e.printStackTrace();
		}
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createPlayerList(java.lang.String)}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void testCreatePlayerListForValue() throws FileNotFoundException {
		String fileName = "player";
		try {
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
			player4.setBattingOrder(4);

			assertThat(CricketUtils.createPlayerList(fileName), IsMapContaining.hasValue(player4));
		} catch (FieldNotPresentException e) {
			fail("testCreatePlayerListForValue failed with FieldNotPresentException");
		}
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createPlayerList(java.lang.String)}.
	 * 
	 * @throws FileNotFoundException
	 */
	@Test
	public void testCreatePlayerListForEntry() throws FileNotFoundException {
		String fileName = "player";
		try {
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
			player2.setBattingOrder(2);

			assertThat(CricketUtils.createPlayerList(fileName),
					IsMapContaining.hasEntry(player2.getBattingOrder(), player2));
		} catch (FieldNotPresentException e) {
			fail("testCreatePlayerListForEntry failed with FieldNotPresentException");
		}
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createMatchDetails(java.lang.String)}.
	 * 
	 * @throws FieldNotPresentException
	 * @throws FileNotFoundException
	 */
	@Test
	public void testCreateMatchDetailsaAllEquals() {
		MatchDetails matchDetails = new MatchDetails();
		matchDetails.setBallsPerOver(6);
		matchDetails.setTargetOvers(4);
		matchDetails.setTargetRuns(40);
		try {
			assertEquals(matchDetails, CricketUtils.createMatchDetails("match"));
		} catch (FileNotFoundException fileException) {
			fail("FileNotFoundException at testCreateMatchDetailsaAllEquals");
		} catch (FieldNotPresentException e) {
			fail("FieldNotPresentException at testCreateMatchDetailsaAllEquals");
		}
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#createMatchDetails(java.lang.String)}.
	 * 
	 * @throws FieldNotPresentException
	 * @throws FileNotFoundException
	 */
	@Test(expected = FileNotFoundException.class)
	public void testCreateMatchDetailsException() throws FileNotFoundException, FieldNotPresentException {
		MatchDetails matchDetails = new MatchDetails();
		matchDetails.setBallsPerOver(6);
		matchDetails.setTargetOvers(4);
		matchDetails.setTargetRuns(40);
			CricketUtils.createMatchDetails("match1");
	}

	/**
	 * Test method for
	 * {@link geektrust.challenge.cricket.utils.CricketUtils#rotateStrike(geektrust.challenge.cricket.pojo.Player, geektrust.challenge.cricket.pojo.Player)}.
	 */
	@Test
	public void testRotateStrike() {
		Player player1 = new Player();
		player1.setName("Player1");
		Player player2 = new Player();
		player2.setName("Player2");

		assertEquals("Player1", CricketUtils.rotateStrike(player1, player2).get(1).getName());
	}

}
