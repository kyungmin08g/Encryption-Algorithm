package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.service;

import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.domain.Blowfish;
import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.repository.BlowfishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlowfishService {
  private final BlowfishRepository repository;

  public void create(String phoneNumber) {
    repository.save(
      Blowfish.builder()
        .phoneNumber(phoneNumber)
        .build()
    );
  }

  public String getPhoneNumber(String id) {
    return repository.findById(Long.parseLong(id))
      .get().getPhoneNumber();
  }
}
