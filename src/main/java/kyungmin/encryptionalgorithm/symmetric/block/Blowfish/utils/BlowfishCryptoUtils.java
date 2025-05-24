package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.utils;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

@Component
public class BlowfishCryptoUtils {
  private static final String key = "blowfish_key";
  private static final String transformation = "Blowfish";

  // 암호화
  public static String encrypt(String plainText) {
    try {
      SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "Blowfish");

      Cipher cipher = Cipher.getInstance(transformation);
      cipher.init(Cipher.ENCRYPT_MODE, secretKey);
      byte[] plainByte = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
      return Hex.encodeHexString(plainByte);
    } catch (Exception e) {
      throw new RuntimeException("암호화 과정에서 오류가 발생했습니다.");
    }
  }

  // 복호화
  public static String decrypt(String cipherText) {
    try {
      SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "Blowfish");

      Cipher cipher = Cipher.getInstance(transformation);
      cipher.init(Cipher.DECRYPT_MODE, secretKey);
      byte[] cipherByte = Hex.decodeHex(cipherText.toCharArray());
      return new String(cipher.doFinal(cipherByte), StandardCharsets.UTF_8);
    } catch (Exception e) {
      throw new RuntimeException("복호화 과정에서 오류가 발생했습니다.", e);
    }
  }
}
