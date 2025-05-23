package kyungmin.encryptionalgorithm.domain.aes.service;

import kyungmin.encryptionalgorithm.domain.aes.domain.AES;
import kyungmin.encryptionalgorithm.domain.aes.repository.AESRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AESService {
  private final AESRepository repository;

  public void create(String phoneNumber) {
    repository.save(
      AES.builder()
        .phoneNumber(phoneNumber)
        .build()
    );
  }
}
