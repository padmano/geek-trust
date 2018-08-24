package gt.be.war.warproblem;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class StartWar {
	public static void main(String[] args) {
		
		Integer fHorse = 100;
		Integer fElephant = 100;
		Integer fTank = 100;
		Integer fSling = 100;
		
		Integer lHorse = LengaburuTroopStrength.HORSE.getStrength();
		Integer lElephant = LengaburuTroopStrength.ELEPHANT.getStrength();
		Integer lTank = LengaburuTroopStrength.TANK.getStrength();
		Integer lSling = LengaburuTroopStrength.SLING.getStrength();
		
		Integer tHorse = null;
		Integer tElephant = null;
		Integer tTank = null;
		Integer tSling = null;
		
		Map<String,TroopSubstitution> subMap = new HashMap<String,TroopSubstitution>();
		
		TroopSubstitution slingSub = new TroopSubstitution(2, "tank", "");
		subMap.put("sling", slingSub);
		
		TroopSubstitution tankSub = new TroopSubstitution(2, "elephant", "sling");
		subMap.put("tank", tankSub);
		
		TroopSubstitution elephantSub = new TroopSubstitution(2, "horse", "tank");
		subMap.put("elephant", elephantSub);
		
		TroopSubstitution horseSub = new TroopSubstitution(2, "", "elephant");
		subMap.put("horse", horseSub);
		
		/*tHorse = */
		
		System.out.println("Hello World!");
	}
}
