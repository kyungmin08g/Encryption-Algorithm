package kyungmin.encryptionalgorithm.domain.aes.repository;

import kyungmin.encryptionalgorithm.domain.aes.domain.AES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AESRepository extends JpaRepository<AES, Long> {
}
