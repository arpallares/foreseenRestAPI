package app.foreseenpoc.to;

public class CSNetTO {
    public CSNetTO(int id, String s){
        this.id=id;
        this.name=s;
    }

    private int id;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
