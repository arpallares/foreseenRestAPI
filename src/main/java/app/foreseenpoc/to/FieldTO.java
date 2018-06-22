package app.foreseenpoc.to;

public class FieldTO {
    public FieldTO(int id, String value, String field, String type){
        this.idfield=id;
        this.value=value;
        this.field=field;
        this.type=type;
    }
    private int idfield;
    private String value;
    private String field;
    private String type;

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
