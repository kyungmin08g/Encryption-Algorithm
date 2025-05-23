package kyungmin.encryptionalgorithm.symmetric.block.AES.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import kyungmin.encryptionalgorithm.symmetric.block.AES.utils.AESCryptoUtils;
import org.springframework.util.StringUtils;

/**
 * AES 암호화 알고리즘을 사용하여 데이터를 저장하기 위한 Converter
 */

@Converter
public class AESCryptoConverter implements AttributeConverter<String, String> {

  @Override
  public String convertToDatabaseColumn(String text) {
    if (!StringUtils.hasText(text)) {
      return null;
    }
    return AESCryptoUtils.encrypt(text);
  }

  @Override
  public String convertToEntityAttribute(String dbData) {
    if (!StringUtils.hasText(dbData)) {
      return null;
    }
    return AESCryptoUtils.decrypt(dbData);
  }
}
