package app.foreseenpoc.service;

import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.domain.Field;
import app.foreseenpoc.domain.Relation;
import app.foreseenpoc.repository.EntityRepository;
import app.foreseenpoc.repository.FieldRepository;
import app.foreseenpoc.repository.RelationReporitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RelationService {
    @Autowired
    private RelationReporitory relationReporitory;
    public List<Entity> getEntityEntities(int idEnt, String table){
        List<Entity> result = new ArrayList<>();
        result.addAll(relationReporitory.findEntitiesById1(idEnt, table));
        result.addAll(relationReporitory.findEntitiesById2(idEnt, table));
        return result;
    }


}
