package in.geektrust.code.tame.service.impl;

import in.geektrust.code.tame.service.Cipher;

/**
 * Seasar Cipher where the encryption rotates the alphabets in circle to the right and left for
 * decryption
 */
public class SeasarCipher implements Cipher {

  @Override
  public String encrypt(String text, int key) {
    StringBuilder cipher = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char decChar;
      int t = text.charAt(i);
      if (t > 122 || t < 97) {
        cipher.append((char) t);
        continue;
      }
      int shiftBy = t + key;
      if (shiftBy > 122) {
        decChar = (char) ((shiftBy - 123) + 97);
      } else {
        decChar = (char) shiftBy;
      }
      cipher.append(decChar);
    }
    return cipher.toString();
  }


  @Override
  public String decrypt(String cipher, int key) {
    StringBuilder text = new StringBuilder();
    for (int i = 0; i < cipher.length(); i++) {
      char decChar;
      int t = cipher.charAt(i);
      if (t > 122 || t < 97) {
        text.append((char) t);
        continue;
      }
      int shiftBy = t - key;
      if (shiftBy < 97) {
        decChar = (char) (123 - (97 - shiftBy));
      } else {
        decChar = (char) shiftBy;
      }
      text.append(decChar);
    }
    return text.toString();
  }
}
