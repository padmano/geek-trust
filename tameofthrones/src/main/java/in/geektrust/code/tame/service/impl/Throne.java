package in.geektrust.code.tame.service.impl;

import in.geektrust.code.tame.TameOfThrone;
import in.geektrust.code.tame.domain.Nation;
import in.geektrust.code.tame.domain.TextMessage;
import in.geektrust.code.tame.exception.ApplicationException;
import in.geektrust.code.tame.service.Alliance;
import in.geektrust.code.tame.util.CommonUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Decides the alliance for a nation
 */
public class Throne implements Alliance {


  /**
   * Format the display to the console message
   *
   * @param nation
   */
  private void formatDisplay(Nation nation) {
    if (nation.getAlliances().isEmpty()
        || nation.getAlliances().size() < TameOfThrone.VICTORY_THRESHOLD) {
      System.out.println("NONE");
    } else {
      StringJoiner joiner = new StringJoiner(" ");
      joiner.add(nation.getName().toUpperCase());
      for (String alliance : nation.getAlliances()) {
        joiner.add(alliance);
      }
      System.out.println(joiner);
    }
  }

  /**
   * Identify the alliance for each nation based on the message
   *
   * @param nation
   * @param msgFilePath
   * @return nation
   * @throws ApplicationException
   */
  @Override
  public Nation identifyAlliances(Nation nation, String msgFilePath) throws ApplicationException {
    nation = getSentMessages(nation, msgFilePath);
    List<String> alliances = new ArrayList<>();
    for (TextMessage textMessage : nation.getTextMessage()) {
      SeasarCipher seasarCipher = new SeasarCipher();
      String emblem = TameOfThrone.nationEmblem.get(textMessage.getTo());
      int emblemLen = emblem.length();
      textMessage.setPlainMsg(seasarCipher.decrypt(textMessage.getCipherMsg(), emblemLen));
      Map<String, Integer> actual = CommonUtils.charOccurrence(textMessage.getPlainMsg());
      Map<String, Integer> expected = TameOfThrone.nationEmblemOccur.get(textMessage.getTo());
      int flag = expected.entrySet().size();
      int i = 0;
      for (Map.Entry<String, Integer> entry : expected.entrySet()) {
        if (actual.containsKey(entry.getKey()) && actual.get(entry.getKey()) >= entry
            .getValue()) {
          i += 1;
        }
      }
      if (flag == i && !alliances.contains(textMessage.getTo().toUpperCase())) {
        alliances.add(textMessage.getTo().toUpperCase());
      }
    }
    nation.setAlliances(alliances);
    formatDisplay(nation);
    return nation;
  }

  /**
   * Method to read messages from the path
   *
   * @param nation
   * @param msgFilePath
   * @return
   * @throws ApplicationException
   */
  private Nation getSentMessages(Nation nation, String msgFilePath) throws ApplicationException {
    List<TextMessage> textMessages = CommonUtils.readFile(msgFilePath);
    nation.setTextMessage(textMessages);
    return nation;
  }
}
