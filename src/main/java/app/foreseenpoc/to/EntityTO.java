package app.foreseenpoc.to;

import app.foreseenpoc.domain.Field;
import app.foreseenpoc.transformer.FieldTransformer;

import java.util.List;

public class EntityTO {
    public EntityTO(int id, String name, List<FieldTO> list){
        this.identity=id;
        this.name= name;
        this.fields=list;
    }
    private int identity;
    private String name;
    private List<FieldTO> fields;

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FieldTO> getFields() {
        return fields;
    }

    public void setFields(List<FieldTO> fields) {
        this.fields = fields;
    }
}
