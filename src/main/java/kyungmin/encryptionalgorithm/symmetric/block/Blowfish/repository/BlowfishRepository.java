package kyungmin.encryptionalgorithm.symmetric.block.Blowfish.repository;

import kyungmin.encryptionalgorithm.symmetric.block.Blowfish.domain.Blowfish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlowfishRepository extends JpaRepository<Blowfish, Long> {
}
