package kyungmin.encryptionalgorithm.config.jpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import kyungmin.encryptionalgorithm.symmetric.block.AES.AESCryptoUtils;
import org.springframework.util.StringUtils;

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
