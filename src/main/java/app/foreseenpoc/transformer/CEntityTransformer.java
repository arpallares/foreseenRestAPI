package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.CEntity;
import app.foreseenpoc.to.CEntityTO;

import java.util.ArrayList;
import java.util.List;

public class CEntityTransformer {
    public static CEntityTO getTO(CEntity cEntity){
         return new CEntityTO(cEntity.getIdcentity(), cEntity.getTable());
    }
    public static List<CEntityTO> getTOs(List<CEntity> cEntities){
        List<CEntityTO> cEntityTOS = new ArrayList<>();
        for(CEntity cEntity : cEntities){
            cEntityTOS.add(getTO(cEntity));
        }
        return cEntityTOS;
    }
}
