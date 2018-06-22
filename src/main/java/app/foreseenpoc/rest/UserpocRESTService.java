package app.foreseenpoc.rest;

import app.foreseenpoc.service.UserpocService;
import app.foreseenpoc.to.CSNetTO;
import app.foreseenpoc.to.UserpocTO;
import app.foreseenpoc.transformer.CSNetTransformer;
import app.foreseenpoc.transformer.UserpocTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import java.util.List;

@Service
@Path("/business")
public class UserpocRESTService {

    @Autowired
    private UserpocService us;

    @GET
    @Produces("application/json")
    @Path("/users")
    public List<UserpocTO> getAll(){
        return UserpocTransformer.getTOs(us.getAll());
    }

    @GET
    @Produces("application/json")
    @Path("/users/{id}")
    public UserpocTO getEUserpoc(@PathParam("id") int id){ return UserpocTransformer.getTO(us.getUserpocById(id)); }

    @GET
    @Produces("application/json")
    @Path("/users/{id}/csnets")
    public List<CSNetTO> getCSNetsByUserId(@PathParam("id") int id){ return CSNetTransformer.getTOs(us.getCSNetsbyUser(id)); }

}
