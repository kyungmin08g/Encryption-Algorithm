package kyungmin.encryptionalgorithm.symmetric.block.DES.service;

import kyungmin.encryptionalgorithm.symmetric.block.DES.repository.DESRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DESService {
  private final DESRepository repository;


}
