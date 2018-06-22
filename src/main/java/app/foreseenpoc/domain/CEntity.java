package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

@Entity
public class CEntity {
    @Id
    @Column(name = "idcentity")
    private int idcentity;
    @Basic
    @Column(name = "table")
    private String table;
    @OneToMany(mappedBy = "cEntity")
    private List<app.foreseenpoc.domain.Entity> entities;
    @OneToMany(mappedBy = "centity")
    private List<EntityDetail> entitiesdetail;
    @OneToMany(mappedBy = "cEntity")
    private List<CEntityCField> centitycfields;

    public int getIdcentity() {
        return idcentity;
    }

    public void setIdcentity(int idcentity) {
        this.idcentity = idcentity;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<app.foreseenpoc.domain.Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<app.foreseenpoc.domain.Entity> entities) {
        this.entities = entities;
    }

    public List<EntityDetail> getEntitiesdetail() {
        return entitiesdetail;
    }

    public void setEntitiesdetail(List<EntityDetail> entitiesdetail) {
        this.entitiesdetail = entitiesdetail;
    }

    public List<CEntityCField> getCentitycfields() {
        return centitycfields;
    }

    public void setCentitycfields(List<CEntityCField> centitycfields) {
        this.centitycfields = centitycfields;
    }
}
