package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Collection;

@Entity
public class CField {
    @Id
    @Column(name = "idcfield")
    private int idcfield;
    @Basic
    @Column(name = "field")
    private String field;
    @Basic
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "cField")
    private Collection<CEntityCField> centitycfields;
    @OneToMany(mappedBy = "cfield")
    private Collection<Field> fields;


    public int getIdcfield() {
        return idcfield;
    }

    public void setIdcfield(int idcfield) {
        this.idcfield = idcfield;
    }


    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }




    public Collection<CEntityCField> getCentitycfields() {
        return centitycfields;
    }

    public void setCentitycfields(Collection<CEntityCField> centityCfieldsByIdcfield) {
        this.centitycfields = centityCfieldsByIdcfield;
    }


    public Collection<Field> getFields() {
        return fields;
    }

    public void setFields(Collection<Field> fieldsByIdcfield) {
        this.fields = fieldsByIdcfield;
    }
}
