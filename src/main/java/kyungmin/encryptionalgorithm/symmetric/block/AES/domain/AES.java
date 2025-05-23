package kyungmin.encryptionalgorithm.symmetric.block.AES.domain;

import jakarta.persistence.*;
import kyungmin.encryptionalgorithm.symmetric.block.AES.converter.AESCryptoConverter;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class AES {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  @Convert(converter = AESCryptoConverter.class) // 커스텀 Converter 추가
  private String phoneNumber;
}
