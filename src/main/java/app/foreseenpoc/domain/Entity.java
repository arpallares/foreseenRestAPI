package app.foreseenpoc.domain;

import javax.persistence.*;
import java.util.List;

@javax.persistence.Entity
public class Entity {
    @Id
    @Column(name = "identity")
    @SequenceGenerator(name = "idsentity", sequenceName = "idsentity", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idsentity")
    private int identity;
    @Basic
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "idcentity", referencedColumnName = "idcentity")
    private CEntity cEntity;
    @OneToMany(mappedBy = "entity")
    private List<EntityTag> entitytags;
    @OneToMany(mappedBy = "entity", fetch = FetchType.EAGER)
    private List<Field> fields;
    @OneToMany(mappedBy = "entity1")
    private List<Relation> relations1;
    @OneToMany(mappedBy = "entity2")
    private List<Relation> relations2;
    @OneToMany(mappedBy = "person")
    private List<Userpoc> userpocs;


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

    public app.foreseenpoc.domain.CEntity getCEntity() {
        return cEntity;
    }

    public void setCEntity(app.foreseenpoc.domain.CEntity CEntity) {
        this.cEntity = CEntity;
    }

    public List<EntityTag> getEntitytags() {
        return entitytags;
    }

    public void setEntitytags(List<EntityTag> entitytags) {
        this.entitytags = entitytags;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public List<Relation> getRelations1() {
        return relations1;
    }

    public void setRelations1(List<Relation> relations1) {
        this.relations1 = relations1;
    }

    public List<Relation> getRelations2() {
        return relations2;
    }

    public void setRelations2(List<Relation> relations2) {
        this.relations2 = relations2;
    }

    public List<Userpoc> getUserpocs() {
        return userpocs;
    }

    public void setUserpocs(List<Userpoc> userpocs) {
        this.userpocs = userpocs;
    }
}
