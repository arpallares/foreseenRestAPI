package com.foreseenrestapi;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")

public class UserService {

    //metodo default
    @GET
    public void defaultm(){
    }

    //metodo para traer usuarios
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> getUsers(){
        UserDao userDao = new UserDao();
        return userDao.getAllUsers();
    }

}