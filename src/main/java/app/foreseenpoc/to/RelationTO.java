package app.foreseenpoc.to;

public class RelationTO {
    public RelationTO(int id, int id2, CEntityTO CEntity1, CEntityTO CEntity2, double affinity, double frequency){
        this.id1=id;
        this.id2=id2;
        this.CEntity1=CEntity1;
        this.CEntity2=CEntity2;
        this.affinity=affinity;
        this.frequency=frequency;
    }

    private int id1;
    private int id2;
    private CEntityTO CEntity1;
    private CEntityTO CEntity2;
    private double affinity;
    private double frequency;

    public int getId1() {
        return id1;
    }

    public void setId1(int id1) {
        this.id1 = id1;
    }

    public int getId2() {
        return id2;
    }

    public void setId2(int id2) {
        this.id2 = id2;
    }

    public CEntityTO getCEntity1() {
        return CEntity1;
    }

    public void setCEntity1(CEntityTO CEntity1) {
        this.CEntity1 = CEntity1;
    }

    public CEntityTO getCEntity2() {
        return CEntity2;
    }

    public void setCEntity2(CEntityTO CEntity2) {
        this.CEntity2 = CEntity2;
    }

    public double getAffinity() {
        return affinity;
    }

    public void setAffinity(double affinity) {
        this.affinity = affinity;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
