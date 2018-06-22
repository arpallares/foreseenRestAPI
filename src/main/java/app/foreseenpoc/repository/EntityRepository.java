package app.foreseenpoc.repository;

import app.foreseenpoc.domain.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<Entity, Integer> {
}
