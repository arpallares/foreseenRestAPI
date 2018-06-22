package app.foreseenpoc.transformer;

import app.foreseenpoc.domain.Entity;
import app.foreseenpoc.domain.Field;
import app.foreseenpoc.to.EntityTO;
import app.foreseenpoc.to.FieldTO;

import java.util.ArrayList;
import java.util.List;

public class FieldTransformer {
    public static FieldTO getTO(Field field){
         return new FieldTO(field.getIdfield(), field.getValue(), field.getCfield().getField(),field.getCfield().getType());
    }
    public static List<FieldTO> getTOs(List<Field> fields){
        List<FieldTO> fieldTOS = new ArrayList<>();
        if(fields!=null)
            for(Field field : fields){
                fieldTOS.add(getTO(field));
            }
            return fieldTOS;
    }
}
