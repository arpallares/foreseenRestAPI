package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Field {
    @Id
    @Column(name = "idfield")
    @SequenceGenerator(name = "idsfield", sequenceName = "idsfield", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idsfield")
    private int idfield;
    @Basic
    @Column(name = "value")
    private String value;
    @ManyToOne
    @JoinColumn(name = "identity", referencedColumnName = "identity")
    private app.foreseenpoc.domain.Entity entity;
    @ManyToOne
    @JoinColumn(name = "idcfield", referencedColumnName = "idcfield")
    private CField cfield;

    public int getIdfield() {
        return idfield;
    }

    public void setIdfield(int idfield) {
        this.idfield = idfield;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public app.foreseenpoc.domain.Entity getEntity() {
        return entity;
    }

    public void setEntity(app.foreseenpoc.domain.Entity entity) {
        this.entity = entity;
    }

    public CField getCfield() {
        return cfield;
    }

    public void setCfield(CField cfield) {
        this.cfield = cfield;
    }
}
