/**
 * 
 */
package geektrust.challenge.cricket.thetoss;

/** Solution for Online Problem
 * 
 * @author Padmanabhan M
 *
 */
public class TheToss {
	public static void main(String[] args) {
		String weather = args[0];
		String time = args[1];
		Integer toss;
		String play = "";
		String team = "";
		long a = 0;
		a = ((System.currentTimeMillis() * 125) % 2796203) % 2;
		if (a == 1)
			toss = 1;
		else
			toss = 0;
		
		switch (toss) {
		
		case 1:
			team = "Lengaburu";
			if(weather.equalsIgnoreCase("clear") && time.equalsIgnoreCase("day")) 
				play = "bats";
			else if(weather.equalsIgnoreCase("cloudy") && time.equalsIgnoreCase("night"))
				play = "bowls";
			else
				play = "bats";
			
			break;
			
		case 0:
			team = "Enchai";
			if(weather.equalsIgnoreCase("clear") && time.equalsIgnoreCase("day")) 
				play = "bowls";
			else if(weather.equalsIgnoreCase("cloudy") && time.equalsIgnoreCase("night"))
				play = "bats";
			else
				play = "bats";
			
			break;
			
		}
		System.out.println(team +" wins toss and "+play);
	}
}
