package in.geektrust.code.tame.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import in.geektrust.code.tame.TameOfThrone;
import in.geektrust.code.tame.exception.ApplicationException;
import java.util.ArrayList;
import java.util.Map;
import org.junit.jupiter.api.Test;


class CommonUtilsTest {


  @Test
  void readFile() throws ApplicationException {
    String offSet = "\\src\\test\\resources\\";
    String fileName = "valid-default-input1.txt";
    String currentDir = System.getProperty("user.dir");
    String fileAbsPath = currentDir.concat(offSet).concat(fileName);
    assertNotEquals(CommonUtils.readFile(fileAbsPath), new ArrayList<>());
    assertEquals(3, CommonUtils.readFile(fileAbsPath).size());
    assertEquals("AIR", CommonUtils.readFile(fileAbsPath).get(0).getTo().toUpperCase());
    assertEquals("ROZO", CommonUtils.readFile(fileAbsPath).get(0).getCipherMsg().toUpperCase());
    assertEquals("LAND", CommonUtils.readFile(fileAbsPath).get(1).getTo().toUpperCase());
    assertEquals("FAIJWJSOOFAMAU",
        CommonUtils.readFile(fileAbsPath).get(1).getCipherMsg().toUpperCase());
    assertEquals("ICE", CommonUtils.readFile(fileAbsPath).get(2).getTo().toUpperCase(), "ICE");
    assertEquals("STHSTSTVSASOS",
        CommonUtils.readFile(fileAbsPath).get(2).getCipherMsg().toUpperCase());
  }

  @Test
  void readFileException() {
    String offSet = "\\src\\test\\resources\\";
    String fileName = "valid-default-input10.txt";
    String currentDir = System.getProperty("user.dir");
    String fileAbsPath = currentDir.concat(offSet).concat(fileName);
    Exception exception = assertThrows(ApplicationException.class, () -> {
      CommonUtils.readFile(fileAbsPath);
    });
    assertEquals("Couldn't load " + fileAbsPath + " from the path", exception.getMessage());
  }

  @Test
  void loadEmblems() {

    CommonUtils.loadEmblems();
    assertTrue(TameOfThrone.nationEmblem.containsKey("space"));
    assertTrue(TameOfThrone.nationEmblem.containsKey("land"));
    assertTrue(TameOfThrone.nationEmblem.containsKey("water"));
    assertTrue(TameOfThrone.nationEmblem.containsKey("ice"));
    assertTrue(TameOfThrone.nationEmblem.containsKey("air"));
    assertTrue(TameOfThrone.nationEmblem.containsKey("fire"));
    assertEquals("gorilla", TameOfThrone.nationEmblem.get("space"));
    assertEquals("panda", TameOfThrone.nationEmblem.get("land"));
    assertEquals("octopus", TameOfThrone.nationEmblem.get("water"));
    assertEquals("mammoth", TameOfThrone.nationEmblem.get("ice"));
    assertEquals("owl", TameOfThrone.nationEmblem.get("air"));
    assertEquals("dragon", TameOfThrone.nationEmblem.get("fire"));
  }

  @Test
  void charOccurrence() {
    String testInput = "abcdefghijklmnopqrstuvwxy";
    Map<String, Integer> actual = CommonUtils.charOccurrence(testInput);
    for (int i = 0; i < testInput.length(); i++) {
      String t = Character.toString(testInput.charAt(i));
      assertTrue(actual.containsKey(t));
      assertEquals(1, actual.get(t));
    }
  }
}