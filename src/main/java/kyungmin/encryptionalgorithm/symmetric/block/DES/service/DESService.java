package kyungmin.encryptionalgorithm.symmetric.block.DES.service;

import kyungmin.encryptionalgorithm.symmetric.block.DES.domain.DES;
import kyungmin.encryptionalgorithm.symmetric.block.DES.repository.DESRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DESService {
  private final DESRepository repository;

  public void create(String phoneNumber) {
    repository.save(
      DES.builder()
        .phoneNumber(phoneNumber)
        .build()
    );
  }

  public String getPhoneNumber(String id) {
    return repository.findById(Long.parseLong(id))
      .get().getPhoneNumber();
  }
}
