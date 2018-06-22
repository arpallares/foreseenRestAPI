package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Table(name = "entity_tag", schema = "public", catalog = "foreseenpoc")
@IdClass(EntityTagPK.class)
public class EntityTag {
    @Id
    @ManyToOne
    @JoinColumn(name = "idtag", referencedColumnName = "idtag", nullable = false)
    private Tag tag;
    @Id
    @ManyToOne
    @JoinColumn(name = "identity", referencedColumnName = "identity", nullable = false)
    private app.foreseenpoc.domain.Entity entity;

    public app.foreseenpoc.domain.Entity getEntity() {
        return entity;
    }

    public void setEntity(app.foreseenpoc.domain.Entity entity) {
        this.entity = entity;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

}
