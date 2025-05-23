package kyungmin.encryptionalgorithm.domain.aes.domain;

import jakarta.persistence.*;
import kyungmin.encryptionalgorithm.config.jpa.AESCryptoConverter;
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
  @Convert(converter = AESCryptoConverter.class)
  private String phoneNumber;
}
