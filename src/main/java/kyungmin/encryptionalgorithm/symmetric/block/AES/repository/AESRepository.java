package kyungmin.encryptionalgorithm.symmetric.block.AES.repository;

import kyungmin.encryptionalgorithm.symmetric.block.AES.domain.AES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AESRepository extends JpaRepository<AES, Long> {
}
