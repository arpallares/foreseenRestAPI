package app.foreseenpoc.to;

public class CEntityTO {
    public CEntityTO(int id, String table){
        this.idcentity=id;
        this.table=table;
    }

    private int idcentity;
    private String table;

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
}
