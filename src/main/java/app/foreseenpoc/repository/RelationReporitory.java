package app.foreseenpoc.repository;

import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.domain.Relation;
import app.foreseenpoc.domain.RelationPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RelationReporitory extends JpaRepository<Relation, RelationPK> {
    @Query("select distinct entity from Entity entity JOIN entity.relations1 relation LEFT JOIN fetch entity.fields fields where relation.entity2.identity = :id and relation.entity1.cEntity.table=:table")
    public List<Entity> findEntitiesById1(@Param("id") int idX, @Param("table") String table);
    @Query("select distinct entity from Entity entity JOIN entity.relations2 relation LEFT JOIN fetch entity.fields fields where relation.entity1.identity = :id and relation.entity2.cEntity.table=:table")
    public List<Entity> findEntitiesById2(@Param("id") int idX, @Param("table") String table);
}
