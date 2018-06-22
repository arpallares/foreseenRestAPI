package app.foreseenpoc.service;

import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.domain.Field;
import app.foreseenpoc.repository.EntityRepository;
import app.foreseenpoc.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EntityService {
    @Autowired
    EntityRepository entityRepository;
    @Autowired
    FieldRepository fieldRepository;
    public Entity getEntityById(int id){ return entityRepository.findById(id).get(); }
    public List<Entity> getAll(){ return entityRepository.findAll(); }
    public Entity createEntity(Entity entity){
        Entity saved = entityRepository.save(entity);
        for(Field field: saved.getFields()){
            field.setEntity(saved);
            fieldRepository.save(field);
        }
        return saved;
    }
}
