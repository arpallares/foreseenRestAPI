package app.foreseenpoc.to;

import app.foreseenpoc.domain.Entity;

public class UserpocTO {
    public UserpocTO(int id, String username, EntityTO person){
        this.idUserpoc =id;
        this.username=username;
        this.person=person;
    }

    private int idUserpoc;
    private String username;
    private EntityTO person;

    public int getIdUserpoc() {
        return idUserpoc;
    }

    public void setIdUserpoc(int idUserpoc) {
        this.idUserpoc = idUserpoc;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public EntityTO getPerson() {
        return person;
    }

    public void setPerson(EntityTO person) {
        this.person = person;
    }
}
