package in.geektrust.code.tame;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import in.geektrust.code.tame.exception.ApplicationException;
import org.junit.jupiter.api.Test;

class TameOfThroneTest {

  private String currentDir = System.getProperty("user.dir");
  private String offSet = "\\src\\test\\resources\\";

  @Test
  void mainTest() {
    String[] args = {currentDir.concat("\\input.txt")};
    assertDoesNotThrow(() -> {
      TameOfThrone.main(args);
    });
  }

  @Test
  void mainException() {
    String[] args = {};
    Exception exception = assertThrows(ApplicationException.class, () -> {
      TameOfThrone.main(args);
    });
    assertEquals("Input File args is missing", exception.getMessage());
  }
}