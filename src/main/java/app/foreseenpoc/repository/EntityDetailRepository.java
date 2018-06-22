package app.foreseenpoc.repository;

import app.foreseenpoc.domain.EntityDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityDetailRepository extends JpaRepository<EntityDetail, Integer> {
}
