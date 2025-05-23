package kyungmin.encryptionalgorithm.symmetric.block.AES.service;

import kyungmin.encryptionalgorithm.symmetric.block.AES.domain.AES;
import kyungmin.encryptionalgorithm.symmetric.block.AES.repository.AESRepository;
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

  public String getPhoneNumber(String id) {
    return repository.findById(Long.parseLong(id))
      .get().getPhoneNumber();
  }
}
