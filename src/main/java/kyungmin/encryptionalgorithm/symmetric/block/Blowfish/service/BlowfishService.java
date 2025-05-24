package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.service;

import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.repository.BlowfishRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlowfishService {
  private final BlowfishRepository repository;

}
