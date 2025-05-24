package kyungmin.encryptionalgorithm.symmetric.block.DES.repository;

import kyungmin.encryptionalgorithm.symmetric.block.DES.domain.DES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DESRepository extends JpaRepository<DES, Long> {
}
