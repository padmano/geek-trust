package in.geektrust.code.tame.util;

import in.geektrust.code.tame.TameOfThrone;
import in.geektrust.code.tame.domain.TextMessage;
import in.geektrust.code.tame.exception.ApplicationException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CommonUtils {

  public static List<TextMessage> readFile(String fileName) throws ApplicationException {
    List<TextMessage> textMessages = new ArrayList<>();
    try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
      stream.forEach(s -> {
        TextMessage msg = new TextMessage();
        String[] splitString = s.toLowerCase().split(" ");
        msg.setTo(splitString[0]);
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i < splitString.length; i++) {
          temp.append(splitString[i].concat(" "));
        }
        msg.setCipherMsg(temp.toString().trim());
        textMessages.add(msg);
      });
    } catch (IOException e) {
      throw new ApplicationException("Couldn't load " + fileName + " from the path");
    }
    return textMessages;
  }


  public static void loadEmblems() {
    String[] nations = {"space", "land", "water", "ice", "air", "fire"};
    String[] emblems = {"gorilla", "panda", "octopus", "mammoth", "owl", "dragon"};
    for (int i = 0; i < nations.length; i++) {
      TameOfThrone.nationEmblem.put(nations[i], emblems[i]);
      Map<String, Integer> lookUpCount;
      lookUpCount = charOccurrence(emblems[i]);
      TameOfThrone.nationEmblemOccur.put(nations[i], lookUpCount);
    }
  }


  public static Map<String, Integer> charOccurrence(String inputString) {

    Map<String, Integer> lookUpCount = new HashMap<>();
    for (int i = 0; i < inputString.length(); i++) {
      String c = Character.toString(inputString.charAt(i));
      if (lookUpCount.containsKey(c)) {
        lookUpCount.put(c, lookUpCount.get(c) + 1);
      } else {
        lookUpCount.put(c, 1);
      }
    }
    return lookUpCount;
  }

}
