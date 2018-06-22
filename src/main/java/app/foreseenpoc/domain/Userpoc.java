package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Userpoc {
    @Id
    @Column(name = "iduserpoc")
    @SequenceGenerator(name = "idsuserpoc", sequenceName = "idsuserpoc", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idsuserpoc")
    private int iduserpoc;
    @Basic
    @Column(name = "username")
    private String username;
    @ManyToOne
    @JoinColumn(name = "idperson", referencedColumnName = "identity")
    private app.foreseenpoc.domain.Entity person;

    public int getIduserpoc() {
        return iduserpoc;
    }

    public void setIduserpoc(int iduserpoc) {
        this.iduserpoc = iduserpoc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public app.foreseenpoc.domain.Entity getPerson() {
        return person;
    }

    public void setPerson(app.foreseenpoc.domain.Entity entity) {
        this.person = entity;
    }
}
