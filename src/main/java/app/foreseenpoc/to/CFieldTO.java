package app.foreseenpoc.to;

public class CFieldTO {
    public CFieldTO(int id, String field, String type){
        this.idcfield=id;
        this.field=field;
        this.type=type;
    }

    private int idcfield;
    private String field;
    private String type;

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
}
