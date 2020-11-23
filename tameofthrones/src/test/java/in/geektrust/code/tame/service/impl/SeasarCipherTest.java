package in.geektrust.code.tame.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SeasarCipherTest {

  @Test
  void encrypt() {

    SeasarCipher seasarCipher = new SeasarCipher();
    assertEquals("ROZO", seasarCipher.encrypt("OLWL".toLowerCase(), 3).toUpperCase());
    assertEquals("FAIJ WJSOO FAMAU",
        seasarCipher.encrypt("AVDE RENJJ AVHVP".toLowerCase(), 5).toUpperCase());
    assertEquals("FAIJWJSOOFAMAU",
        seasarCipher.encrypt("AVDERENJJAVHVP".toLowerCase(), 5).toUpperCase());
    assertEquals("STHSTSTVSASOS",
        seasarCipher.encrypt("LMALMLMOLTLHL".toLowerCase(), 7).toUpperCase());
    assertEquals("SUMMER IS COMING",
        seasarCipher.encrypt("NPHHZM DN XJHDIB".toLowerCase(), 5).toUpperCase());

  }

  @Test
  void decrypt() {
    SeasarCipher seasarCipher = new SeasarCipher();
    assertEquals("OLWL", seasarCipher.decrypt("ROZO".toLowerCase(), 3).toUpperCase());
    assertEquals("AVDE RENJJ AVHVP",
        seasarCipher.decrypt("FAIJ WJSOO FAMAU".toLowerCase(), 5).toUpperCase());
    assertEquals("AVDERENJJAVHVP",
        seasarCipher.decrypt("FAIJWJSOOFAMAU".toLowerCase(), 5).toUpperCase());
    assertEquals("LMALMLMOLTLHL",
        seasarCipher.decrypt("STHSTSTVSASOS".toLowerCase(), 7).toUpperCase());
    assertEquals("NPHHZM DN XJHDIB",
        seasarCipher.decrypt("SUMMER IS COMING".toLowerCase(), 5).toUpperCase());

  }
}