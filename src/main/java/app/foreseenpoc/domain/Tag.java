package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Tag {
    @Id
    @Column(name = "idtag")
    @SequenceGenerator(name = "idstag", sequenceName = "idstag", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idstag")
    private int idtag;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "tag")
    private Collection<EntityTag> entitytags;

    public int getIdtag() {
        return idtag;
    }

    public void setIdtag(int idtag) {
        this.idtag = idtag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<EntityTag> getEntitytags() {
        return entitytags;
    }

    public void setEntitytags(Collection<EntityTag> entitytags) {
        this.entitytags = entitytags;
    }
}
