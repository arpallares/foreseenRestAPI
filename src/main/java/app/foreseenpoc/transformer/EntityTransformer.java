package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.CEntity;
import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.to.CEntityTO;
import app.foreseenpoc.to.EntityTO;

import java.util.ArrayList;
import java.util.List;

public class EntityTransformer {
    public static EntityTO getTO(Entity entity){
         return new EntityTO(entity.getIdentity(), entity.getName(), FieldTransformer.getTOs(entity.getFields()));
    }
    public static List<EntityTO> getTOs(List<Entity> entities){
        List<EntityTO> entityTOS = new ArrayList<>();
        for(Entity entity : entities){
            entityTOS.add(getTO(entity));
        }
        return entityTOS;
    }
}
