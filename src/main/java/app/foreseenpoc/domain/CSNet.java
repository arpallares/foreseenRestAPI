package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Collection;
import java.util.Objects;

@Entity
public class CSNet {
    @Id
    @Column(name = "idcsnet")
    private int idcsnet;
    @Basic
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "csnet")
    private Collection<EntityDetail> entitiesdetail;
    @OneToMany(mappedBy = "csnet")
    private Collection<UserpocSNet> userpocsnets;

    public int getIdcsnet() {
        return idcsnet;
    }

    public void setIdcsnet(int idcsnet) {
        this.idcsnet = idcsnet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<EntityDetail> getEntitiesdetail() {
        return entitiesdetail;
    }

    public void setEntitiesdetail(Collection<EntityDetail> entitiesdetail) {
        this.entitiesdetail = entitiesdetail;
    }

    public Collection<UserpocSNet> getUserpocsnets() {
        return userpocsnets;
    }

    public void setUserpocsnets(Collection<UserpocSNet> userpocsnets) {
        this.userpocsnets = userpocsnets;
    }
}
