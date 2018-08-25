/**
 * 
 */
package geektrust.challenge.cricket;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import geektrust.challenge.cricket.pojo.Player;
import geektrust.challenge.cricket.utils.CricketUtils;

/**
 * @author Padmanabhan M
 *
 */
@RunWith(Suite.class)
@SuiteClasses({CricketUtilsTest.class})
public class PlayCricketTest {

	
	static Map<Integer, Player> players  = new HashMap<Integer, Player>();
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		players = CricketUtils.createPlayerList("player");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link geektrust.challenge.cricket.PlayCricket#main(java.lang.String[])}.
	 */
	/*@Test
	public void testMain() {
		fail("Not yet implemented"); // TODO
	}*/

}
