package in.geektrust.code.tame.service;

/**
 * Interface to be implemented for all types of Ciphers
 */
public interface Cipher {


  /**
   * Encrypt the plain text to a cipher text based on the key
   *
   * @param text
   * @param key
   * @return
   */
  String encrypt(String text, int key);


  /**
   * Decrypt the cipher text to plain text with the key
   *
   * @param cipher
   * @param key
   * @return
   */
  String decrypt(String cipher, int key);

}
