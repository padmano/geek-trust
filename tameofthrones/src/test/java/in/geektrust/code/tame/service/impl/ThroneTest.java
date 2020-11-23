package in.geektrust.code.tame.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import in.geektrust.code.tame.domain.Nation;
import in.geektrust.code.tame.exception.ApplicationException;
import in.geektrust.code.tame.util.CommonUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ThroneTest {

  private String currentDir = System.getProperty("user.dir");
  private String offSet = "\\src\\test\\resources\\";

  @BeforeAll
  public static void loadData() throws ApplicationException {
    CommonUtils.loadEmblems();
  }

  @Test
  void identifyAlliances1() throws ApplicationException {
    String fileName = "valid-default-input1.txt";
    String fileAbsPath = currentDir.concat(offSet).concat(fileName);
    Throne throne = new Throne();
    Nation nation = new Nation();
    nation.setName("space");
    throne.identifyAlliances(nation, fileAbsPath);
    assertNotNull(nation.getAlliances());
    assertEquals(nation.getAlliances().size(), 3);
    assertEquals(nation.getAlliances().get(0), "AIR");
    assertEquals(nation.getAlliances().get(1), "LAND");
    assertEquals(nation.getAlliances().get(2), "ICE");
  }

  @Test
  void identifyAlliances2() throws ApplicationException {
    String fileName = "valid-default-input2.txt";
    String fileAbsPath = currentDir.concat(offSet).concat(fileName);
    Throne throne = new Throne();
    Nation nation = new Nation();
    nation.setName("space");
    throne.identifyAlliances(nation, fileAbsPath);
    assertNotNull(nation.getAlliances());
    assertEquals(nation.getAlliances().size(), 3);
    assertEquals(nation.getAlliances().get(0), "LAND");
    assertEquals(nation.getAlliances().get(1), "ICE");
    assertEquals(nation.getAlliances().get(2), "FIRE");
  }

  @Test
  void identifyAlliances3() throws ApplicationException {
    String fileName = "valid-default-input3.txt";
    String fileAbsPath = currentDir.concat(offSet).concat(fileName);
    Throne throne = new Throne();
    Nation nation = new Nation();
    nation.setName("space");
    throne.identifyAlliances(nation, fileAbsPath);
    assertNotNull(nation.getAlliances());
    assertEquals(nation.getAlliances().size(), 2);
  }
}