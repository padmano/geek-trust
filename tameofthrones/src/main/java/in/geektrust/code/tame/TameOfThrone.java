package in.geektrust.code.tame;

import in.geektrust.code.tame.domain.Nation;
import in.geektrust.code.tame.exception.ApplicationException;
import in.geektrust.code.tame.service.impl.Throne;
import in.geektrust.code.tame.util.CommonUtils;
import java.util.HashMap;
import java.util.Map;

public class TameOfThrone {

  public static final int VICTORY_THRESHOLD = 3;
  public static final Map<String, String> nationEmblem = new HashMap<>();
  public static final Map<String, Map<String, Integer>> nationEmblemOccur = new HashMap<>();

  public static void main(String[] args) throws ApplicationException {
    if (args != null && args.length == 1 && args[0] != null) {
      CommonUtils.loadEmblems();
      Throne throne = new Throne();
      Nation senderNation = new Nation();
      senderNation.setName("space");
      throne.identifyAlliances(senderNation, args[0]);
    } else {
      throw new ApplicationException("Input File args is missing");
    }
  }
}
