package app.foreseenpoc.repository;

import app.foreseenpoc.domain.CSNet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CSNetRepository extends JpaRepository<CSNet, Integer> {
}
