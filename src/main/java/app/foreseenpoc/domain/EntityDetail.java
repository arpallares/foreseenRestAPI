package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class EntityDetail {
    @Id
    @Column(name = "identitydetail")
    @SequenceGenerator(name = "idsentitydetail", sequenceName = "idsentitydetail", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idsentitydetail")
    private Integer identitydetail;
    @Basic
    @Column(name = "entityid")
    private String entityid;
    @ManyToOne
    @JoinColumn(name = "idorigen", referencedColumnName = "idcsnet")
    private CSNet csnet;
    @ManyToOne
    @JoinColumn(name = "mainentity", referencedColumnName = "idcentity")
    private CEntity centity;

    public Integer getIdentitydetail() {
        return identitydetail;
    }

    public void setIdentitydetail(Integer identitydetail) {
        this.identitydetail = identitydetail;
    }

    public String getEntityid() {
        return entityid;
    }

    public void setEntityid(String entityid) {
        this.entityid = entityid;
    }

    public CSNet getCsnet() {
        return csnet;
    }

    public void setCsnet(CSNet csnet) {
        this.csnet = csnet;
    }

    public CEntity getCentity() {
        return centity;
    }

    public void setCentity(CEntity centity) {
        this.centity = centity;
    }
}
