package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.CField;
import app.foreseenpoc.domain.CField;
import app.foreseenpoc.to.CFieldTO;
import app.foreseenpoc.to.CFieldTO;

import java.util.ArrayList;
import java.util.List;

public class CFieldTransformer {
    public static CFieldTO getTO(CField cField){
         return new CFieldTO(cField.getIdcfield(), cField.getField(), cField.getType());
    }
    public static List<CFieldTO> getTOs(List<CField> cEntities){
        List<CFieldTO> cFieldTOS = new ArrayList<>();
        for(CField cField : cEntities){
            cFieldTOS.add(getTO(cField));
        }
        return cFieldTOS;
    }
}
