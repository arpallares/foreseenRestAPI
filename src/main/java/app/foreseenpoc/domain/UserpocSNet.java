package app.foreseenpoc.domain;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
@Table(name = "userpoc_snet", schema = "public", catalog = "foreseenpoc")
public class UserpocSNet {
    @Id
    @Column(name = "idusersnet")
    @SequenceGenerator(name = "idsusersnet", sequenceName = "idsusersnet", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idsusersnet")
    private int idusersnet;
    @Basic
    @Column(name = "snetusername")
    private String snetusername;
    @Basic
    @Column(name = "token")
    private String token;
    @ManyToOne
    @JoinColumn(name = "idcsnet", referencedColumnName = "idcsnet", nullable = false)
    private CSNet csnet;
    @ManyToOne
    @JoinColumn(name = "iduserpoc", referencedColumnName = "iduserpoc", nullable = false)
    private Userpoc userpoc;

    public String getSnetusername() {
        return snetusername;
    }

    public void setSnetusername(String snetusername) {
        this.snetusername = snetusername;
    }

    public int getIdusersnet() {
        return idusersnet;
    }

    public void setIdusersnet(int idusersnet) {
        this.idusersnet = idusersnet;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CSNet getCsnet() {
        return csnet;
    }

    public void setCsnet(CSNet csnet) {
        this.csnet = csnet;
    }

    public Userpoc getUserpoc() {
        return userpoc;
    }

    public void setUserpoc(Userpoc userpoc) {
        this.userpoc = userpoc;
    }
}
