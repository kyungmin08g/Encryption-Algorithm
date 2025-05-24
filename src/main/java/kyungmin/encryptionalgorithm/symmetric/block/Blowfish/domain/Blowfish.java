package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.domain;

import jakarta.persistence.*;
import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.converter.BlowfishCryptoConverter;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Blowfish {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  @Convert(converter = BlowfishCryptoConverter.class)
  private String phoneNumber;
}
