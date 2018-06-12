package com.foreseenrestapi;

import com.springjpa.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/accounts")
@Service
public class AccountRESTService {

    @Autowired
    private AccountService as;

    @GET
    @Produces("application/json")
    public List<Account> getAll(){
        return as.getAllAccounts();
    }

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/account")
    public Account createAccount(Account account){
        return as.createAccount(account);
    }

    @GET
    @Produces("application/json")
    @Path("/{id}")
    public Account getAccount(@PathParam("id") int id){
        return as.getAccount(id);
    }

    @DELETE
    @Path("/{id}")
    public void deleteAccount(@PathParam("id") int id){
        as.deleteAccount(id);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/account")
    public Account updateAccount(Account account){
        return as.updateAccount(account);
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/{id}")
    public Account updateBalance(@PathParam("id") int id, @QueryParam("balance") double balance){
        return as.updateBalance(id, balance);
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces("application/json")
    @Path("/{id}")
    public Account updateFields(@PathParam("id") int id, Account account){
        return as.updateFields(id, account);
    }
}