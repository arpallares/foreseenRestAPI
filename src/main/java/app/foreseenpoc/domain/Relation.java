package app.foreseenpoc.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@javax.persistence.Entity
@IdClass(RelationPK.class)
@Table(name = "relation")
public class Relation implements Serializable {

    @Basic
    @Column(name = "affinity")
    private double affinity;
    @Basic
    @Column(name = "frequency")
    private double frequency;
    @Id
    @ManyToOne
    @JoinColumn(name = "identity1", referencedColumnName = "identity", nullable = false)
    private Entity entity1;
    @Id
    @ManyToOne
    @JoinColumn(name = "identity2", referencedColumnName = "identity", nullable = false)
    private Entity entity2;

    public double getAffinity() {
        return affinity;
    }

    public Entity getEntity1() {
        return entity1;
    }

    public void setEntity1(Entity entity1) {
        this.entity1 = entity1;
    }

    public Entity getEntity2() {
        return entity2;
    }

    public void setEntity2(Entity entity2) {
        this.entity2 = entity2;
    }

    public void setAffinity(double affinity) {
        this.affinity = affinity;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
}