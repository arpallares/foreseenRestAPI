package app.foreseenpoc.repository;

import app.foreseenpoc.domain.Field;
import app.foreseenpoc.domain.Relation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FieldRepository extends JpaRepository<Field, Integer> {
    @Query("select Field from Field field where field.entity.identity = :id")
    public List<Field> findEntityFields(@Param("id") int id);

}
