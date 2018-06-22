package app.foreseenpoc.repository;

import app.foreseenpoc.domain.Userpoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserpocRepository extends JpaRepository<Userpoc, Integer> {
//    @Query("select userpoc from Userpoc userpoc JOIN fetch userpoc.person p JOIN fetch p.fields")
//    public List<Userpoc> findAll();
//    @Query("select userpoc from Userpoc userpoc JOIN fetch userpoc.person p JOIN fetch p.fields where userpoc.iduserpoc=:id")
//    public Userpoc findById(@Param("id") int idX);
}
