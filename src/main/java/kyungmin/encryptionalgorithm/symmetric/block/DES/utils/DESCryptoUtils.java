package kyungmin.encryptionalgorithm.symmetric.block.DES.utils;

import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Component;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.nio.charset.StandardCharsets;

@Component
public class DESCryptoUtils {
  private static final String DESKey = "DESCryptoAlgorithm";
  private static final String transformation = "DES/CBC/PKCS5Padding";

  public static String encrypt(String plainText) {
    try {
      DESKeySpec desKey = new DESKeySpec(DESKey.getBytes(StandardCharsets.UTF_8));
      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(transformation);

      Cipher cipher = Cipher.getInstance(transformation);
      cipher.init(Cipher.ENCRYPT_MODE, keyFactory.generateSecret(desKey));
      byte[] plainByte = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
      return Hex.encodeHexString(plainByte);
    } catch (Exception e) {
      throw new RuntimeException("암호화 과정에서 오류가 발생했습니다.");
    }
  }

  public static String decrypt(String cipherText) {
    try {
      DESKeySpec desKey = new DESKeySpec(DESKey.getBytes(StandardCharsets.UTF_8));
      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(transformation);

      Cipher cipher = Cipher.getInstance(transformation);
      cipher.init(Cipher.DECRYPT_MODE, keyFactory.generateSecret(desKey));
      byte[] cipherByte = Hex.decodeHex(cipherText.toCharArray());
      return new String(cipher.doFinal(cipherByte), StandardCharsets.UTF_8);
    } catch (Exception e) {
      throw new RuntimeException("복호화 과정에서 오류가 발생했습니다.");
    }
  }
}
