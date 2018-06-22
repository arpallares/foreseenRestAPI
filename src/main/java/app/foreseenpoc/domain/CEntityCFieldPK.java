package app.foreseenpoc.domain;

import java.io.Serializable;

public class CEntityCFieldPK implements Serializable {

    private CEntity cEntity;
    private CField cField;

    public CEntity getcEntity() {
        return cEntity;
    }

    public void setcEntity(CEntity cEntity) {
        this.cEntity = cEntity;
    }

    public CField getcField() {
        return cField;
    }

    public void setcField(CField cField) {
        this.cField = cField;
    }
}
