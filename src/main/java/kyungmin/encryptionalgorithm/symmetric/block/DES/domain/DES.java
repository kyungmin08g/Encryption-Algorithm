package kyungmin.encryptionalgorithm.symmetric.block.DES.domain;

import jakarta.persistence.*;
import kyungmin.encryptionalgorithm.symmetric.block.DES.converter.DESCryptoConverter;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class DES {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  @Convert(converter = DESCryptoConverter.class)
  private String phoneNumber;
}
