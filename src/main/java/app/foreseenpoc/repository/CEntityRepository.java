package app.foreseenpoc.repository;

import app.foreseenpoc.domain.CEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CEntityRepository extends JpaRepository<CEntity, Integer> {
}
