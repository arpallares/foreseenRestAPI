package app.foreseenpoc.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

public class RelationPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "identity1", referencedColumnName = "identity", nullable = false)
    private Entity entity1;
    @ManyToOne
    @JoinColumn(name = "identity2", referencedColumnName = "identity", nullable = false)
    private Entity entity2;

    public Entity getEntity1() {
        return entity1;
    }

    public void setEntity1(Entity entity1) {
        this.entity1 = entity1;
    }

    public Entity getEntity2() {
        return entity2;
    }

    public void setEntity2(Entity entity2) {
        this.entity2 = entity2;
    }

}
