package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Table(name = "centity_cfield", schema = "public", catalog = "foreseenpoc")
@IdClass(CEntityCFieldPK.class)
public class CEntityCField {
    @Id
    @ManyToOne
    @JoinColumn(name = "idcentity", referencedColumnName = "idcentity", nullable = false)
    private CEntity cEntity;
    @Id
    @ManyToOne
    @JoinColumn(name = "idcfield", referencedColumnName = "idcfield", nullable = false)
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
